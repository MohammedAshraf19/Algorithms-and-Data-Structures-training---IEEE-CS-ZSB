import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
       int n =s.nextInt();
       int l =800;
       for(int i =1;true;i++){
          if(n<=l){
              System.out.println(i);
              break;
          }
          l =l+800;
       }
}
}
