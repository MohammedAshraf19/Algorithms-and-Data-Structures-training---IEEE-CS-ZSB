
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
       String a =s.next();
       char c [] =new char [a.length()];
       c[0] =a.charAt(0);
       for(int i =2;i<a.length();i++){
           int col =1;
           if(a.charAt(i)=='/'&&a.charAt(i+1)=='/'){
               col++;
               continue;
           }
           else{
               c[i] =a.charAt(i);
               col++;
           }
       }
       for(int i =0;i<a.length();i++){
           System.out.print(c[i]);
       }
        System.out.println();
    }
}