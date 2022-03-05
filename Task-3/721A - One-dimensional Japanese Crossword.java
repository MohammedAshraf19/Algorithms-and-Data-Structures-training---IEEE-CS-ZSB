import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        int re [] = new int [100];
        int count =0;
        int j =0;
        String a =s.next();
        
        for (int i = 0; i <= no -1; i++) {
           if(a.charAt(i)  == 'B'){
               count++;
               re[j] =count;
               if (i == no - 1) {
                j++;
            }
        } else if (count != 0) {
            count = 0;
            j++;
        }
           }
        
       System.out.println(j);
       for (int i = 0; i < j; i++) {
        System.out.println(re[i]);
    }
    }
}
