import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int n =s.nextInt();
        int [] a= new int [n];
        int re =0;
        for(int i =0;i<=n-1;i++){
         a[i]=s.nextInt();
        }
        Arrays.sort(a);
        for(int i =0;i<=n-1;i++){
            if(n==1)
            {
                if(a[0]!=0)
                    re++;
                break;
            }
         if(a[i]==0&&a[n-1]==0)
             break;
         
         if(a[i]==a[n-1]){
             re++;
             break;
         }
         if(i !=n-1&&a[i] !=0&&a[i]!=a[i+1])
             re++;
         if(i==n-1 &&a[n-1] != a[n-2])
             re++;
        }
       
        System.out.println(re);
}
}
