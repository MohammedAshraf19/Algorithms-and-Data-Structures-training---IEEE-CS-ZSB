import java.util.Scanner;
public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
       int n =s.nextInt();
       for(int i =1;i<=10;i++){
           int z =i*n;
           System.out.println(i+" x "+n+" = "+z);
       }
       
}
}