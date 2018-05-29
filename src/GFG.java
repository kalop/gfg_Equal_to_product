import java.util.Scanner;

//Given an array of integers check whether there are two numbers present with given product.
//
//Input:
//
//The first line of input contains an integer T denoting the number of test cases.
//The first line of each test case is N and a product p.
//The second line of each test case contain N number of a[].
//
//Output:
//Print Yes if two numbers product is equal to p else No.

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
            }
           
            boolean found = false;
            for (int i = 0; i < n-1; i++){
            	for (int j = i+1; j < n; j++) {            		
            		if(arr[i] * arr[j] == p){
                    	System.out.println("yes");  
                    	found = true;
                    	break;
                    }
				}            
            }         
            if(!found){
            	System.out.println("no");            	
            }
            
            t--;
        }
	}

}
