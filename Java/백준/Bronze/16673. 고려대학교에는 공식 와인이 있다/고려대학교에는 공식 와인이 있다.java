import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int k = sc.nextInt();
		int p = sc.nextInt();
		int result1 = 0, sum = 0;
		for(int i = 1; i <= c; i++) {
		    result1 = (i*k) + (i * i * p);
		    sum += result1;
		}
		System.out.print(sum);
	}
}
