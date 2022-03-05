import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        String a[] = new String[1];
        int count=0;
        int star =0;
        a[0] =s.next();
        for(int i =1;i<a[0].length();i++){
            if(a[0].charAt(star)==a[0].charAt(i)){
                count++;
                star++;
            }
            else{
                star++;
            }
        }
        System.out.println(count);
    }
    }