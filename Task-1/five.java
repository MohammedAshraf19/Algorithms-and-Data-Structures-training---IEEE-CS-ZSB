import java.math.BigDecimal;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
       double h =s.nextInt();
       double kg =s.nextInt();
       double l = (h*kg)/12;
       BigDecimal   b   =   new   BigDecimal(l);  
       double   l1   =   b.setScale(3,   BigDecimal.ROUND_HALF_UP).doubleValue();  
       System.out.println(l1);
}
}