import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int result1[] = new int[n]; // 몫
		int result2[] = new int[n]; // 나머지지

		
		for(int i = 0; i < n; i++) {
		    result1[i] = sc.nextInt();
		    result2[i] = sc.nextInt();
		} 
		
		for(int i = 0; i < n; i++) {
		    System.out.printf("You get %d piece(s) and your dad gets %d piece(s).\n", result1[i] / result2[i], result1[i] % result2[i]);
		}
	}
}
