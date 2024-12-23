import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = 0;
		
		if (num % 5 == 0)
	        count = num / 5;
	    else 
	        count += (num / 5) + 1;
	    
	    System.out.print(count);
	}
}
