import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int a[] = new int [n];
        for(int i =0;i<=n-1;i++){
            a[i] =s.nextInt();
        }
        
         for(int step = 1; step < n; step++) {
      int k = a[step];
      int j = step - 1;
      while (j >= 0 && k < a[j]) {
        a[j + 1] = a[j];
        --j;
         for(int i =0;i<=n-1;i++){
            System.out.print(a[i]+" ");
        }
         System.out.println();
      }
      a[j + 1] = k;
    }
     for(int i =0;i<=n-1;i++){
            System.out.print(a[i]+" ");
        }    
      System.out.println();
    }
}

