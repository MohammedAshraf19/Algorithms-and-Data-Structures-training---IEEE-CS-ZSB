import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int n =s.nextInt();
         int k =s.nextInt();
         int []a = new int [n];
         int count =0;
         for(int i =0;i<=n-1;i++){
             a[i]=s.nextInt();
         }
         for(int i =0;i<=n-1;i++){
             if(k >= a[i]){
                 count++;
                 continue;
             }
             else{
                 break;
             }
         }
          for(int i =n-1;i>=0;i--){
             if(k >= a[i]){
                 count++;
                 continue;
             }
             else{
                 break;
             }
         }
          if(count == n*2){
                 count = count /2;
             }
         System.out.println(count);
      
}
}
