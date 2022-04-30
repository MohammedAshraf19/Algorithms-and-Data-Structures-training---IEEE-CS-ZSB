import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s =in.next();
        int count = 1;
        char c [] =s.toCharArray();
        for(int i =0;i<c.length;i++){
            if(c[i]>='A'&&c[i]<='Z')
            count++;
        }
        System.out.println(count);
    }
    }
