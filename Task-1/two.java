import java.math.BigDecimal;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        double max, min;
        long N = in.nextLong();
        max = (N / Math.log(N));
        min = (N / Math.log(N)) * 1.25506;
        BigDecimal   b   =   new   BigDecimal(max);  
       double   l1   =   b.setScale(1,   BigDecimal.ROUND_HALF_UP).doubleValue();  
       
        BigDecimal   c   =   new   BigDecimal(min);  
       double   l2   =   c.setScale(1,   BigDecimal.ROUND_HALF_UP).doubleValue();  
        System.out.println(l1 + " " + l2);
}
}