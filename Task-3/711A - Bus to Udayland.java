import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        char c[][] = new char[no][5];
        boolean isFound = false;
        for (int i = 0; i <= no - 1; i++) {
            String in = s.next();
            for(int k =0;k< 5;k++){
                c[i][k] = in.charAt(k);
    }
        }
        for (int i = 0; i <= no - 1; i++) {
            for (int k = 0; k <= 4; k = k + 3) {
                if (c[i][k] == 'O' && c[i][k+1] == 'O') {
                    c[i][k] = '+';
                    c[i][k+1] = '+';
                    isFound = true;
                    break;
                }

            }
        }
        if (isFound) {
            System.out.println("YES");
            for (int i = 0; i <= no - 1; i++) {
                System.out.println(c[i]);
            }
        } else {
            System.out.println("NO");
        }
    }
}
