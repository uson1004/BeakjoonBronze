import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int C = sc.nextInt();
		
		int[] cycle = new int[N];
		int[] count = new int[C];
		
		for(int i = 0; i < N; i++)
		    cycle[i] = sc.nextInt();
		
		int k = 0;
		int result = 0;
		
		while(k != N) {
		    for(int i = 1; i <= C; i++) {
	            if(i % cycle[k] == 0)
	                count[i - 1] = 1;
	        }
	        k++;
		}
	    
	    for(int i = 0; i < C; i++) {
	        if(count[i] != 0)
	            result += 1;
	    }
	    
	    System.out.print(result);
	}
}
