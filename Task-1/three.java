import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
       int n =s.nextInt();
       String b = "a";
       for(int i =1;i<=n;i++){
           char z ='a';
           if(i != 1)
               b =b+z;
       }
       System.out.println("Feliz "+"nat"+b+'l'+"!");
       
}
}