import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, m;
        n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        m =s.nextInt();
        for(int i=0;i<m;i++){
	int x =s.nextInt();
	int y =s.nextInt();
	int rigth=arr[x-1]-y;
	int left=y-1;
	if(x-1>=1){
		arr[x-2]+=left;
	}
	if(x+1<=n){
		arr[x]+=rigth;
	}
	arr[x-1]=0;
		
	}
	for(int i=0;i<n;i++){
		System.out.println(arr[i]);
	}
    }
}
