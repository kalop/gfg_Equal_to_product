import java.util.Scanner;

public class GFG {

	public static void main(String[] args) {
		
		int[] arr = new int[1000];
		 
      	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        while (t > 0){
            int n = sc.nextInt();
            int p = sc.nextInt();
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                System.out.print(arr[i]);
            }
            System.out.print(" \n");
            t--;
        }
	}

}
