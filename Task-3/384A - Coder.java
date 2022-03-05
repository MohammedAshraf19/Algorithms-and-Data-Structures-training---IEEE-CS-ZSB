import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        char a[][] = new char[n][n];
        int re=0;
        if(n%2==1)
             re = (int) Math.floor((n*n)/2)+1;
        else
            re = (int) Math.floor((n*n)/2);
        for(int i =0;i<=a.length-1;i++){
            for(int k =0;k<=a[i].length-1;k++){
                a[i][k]= '.';
        }
        }
        for(int i =0;i<=a.length-1;i ++){
            for(int k =0;k<=a[i].length-1;k++){
                if((i%2==0&&k%2==0)||(i%2==1&&k%2==1))
                    a[i][k]= 'C';
        }
        }
        System.out.println(re);
        for(int i =0;i<=a.length-1;i ++){
            for(int k =0;k<=a[i].length-1;k ++){
                System.out.print(a[i][k]);
        }
            System.out.println();
        }
        }
    }

