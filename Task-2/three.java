import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int n =s.nextInt();
        int [] a= new int [n];
        int ser =0;
        int dima = 0;
        int e =n-1;
        int c =0;
        for(int i =0;i<=n-1;i++){
         a[i]=s.nextInt();
        }
        for(int i =0;i<=n-1;i++){
            if(i % 2 ==0){
                if(a[c]>a[e]){
                ser = ser + a[c];
                c++;
            }
            else{ 
                ser = ser + a[e];
                e--;
            }
            }
            else{
                
             if(a[c]>a[e]){
                dima = dima + a[c];
                c++;
            }
            else{
                dima = dima + a[e];
                e--;
            }
            }
        }
        System.out.println(ser+" "+dima);
}
}