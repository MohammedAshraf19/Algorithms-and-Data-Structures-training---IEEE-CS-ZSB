import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no =s.nextInt();
        String c = s.next();
        int d =0;
        int a =0;
        for(int i=0;i<=no-1;i++){
            if(c.charAt(i) == 'A')
                a++;
            else
                d++;
        }
        if(d>a)
            System.out.println("Danik");
        else if(d<a)
            System.out.println("Anton");
        else
            System.out.println("Friendship");
    }
    }