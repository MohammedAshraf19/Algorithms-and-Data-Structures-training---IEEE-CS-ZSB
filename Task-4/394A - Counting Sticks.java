import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int count1 =0;
        int count2 =0;
        int re =0;
        String c =s.nextLine();
         char cha[] =new char [c.length()+1];
         int col =0;
        for(int i =0;i<c.length();i++){
            if(c.charAt(i)=='='){
                re =i;
                break;
            }
            else if(c.charAt(i)!='+')
                count1++;
            
        }
        for(int i =re;i<c.length()-1;i++){
            count2++;
        }
        if(count1 == count2){
            System.out.println(c);
        }
        else if(count1+1 < count2-1||count1+1 > count2-1){
            System.out.println("Impossible");
        }
        else if(count1+1 == count2-1){
         for(int i =0;i<c.length()-1;i++){
            if(c.charAt(i)!='+'){
                cha[col] = c.charAt(i);
                col++;
           }
            else{
                cha[col] = '|';
                col++;
                cha[col] = c.charAt(i);
                col++;
            }
                
        }   
         
          for(int i =0;i<cha.length;i++){
            System.out.print(cha[i]);
        }
          System.out.println();
        }
        
    }
}