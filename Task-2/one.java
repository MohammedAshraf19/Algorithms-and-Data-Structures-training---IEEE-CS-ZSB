import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        int [][] a= new int [5][5];
        int re =0;
        for(int i =0;i<=a.length-1;i++){
            for(int k =0;k<=a[i].length-1;k++){
                a[i][k] =s.nextInt();
        }
        }
        if(a[0][4]==1||a[0][0]==1||a[4][4]==1||a[4][0]==1)
            re =4;
        if(a[2][4]==1||a[2][0]==1||a[1][3]==1||a[1][1]==1||a[3][3]==1||a[3][1]==1||a[0][2]==1||a[4][2]==1)
            re =2;
        if(a[1][0]==1||a[1][4]==1||a[3][4]==1||a[3][0]==1||a[0][3]==1||a[0][1]==1||a[4][3]==1||a[4][1]==1)
            re =3;
        if(a[2][3]==1||a[2][1]==1||a[1][2]==1||a[3][2]==1)
            re =1;
        if(a[2][2]==1)
            re =0;
        
        System.out.println(re);
}
}
