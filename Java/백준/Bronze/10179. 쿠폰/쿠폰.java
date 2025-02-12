import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double arr[] = new double[n];
		
		for(int i = 0; i < n; i++) {
		    arr[i] = sc.nextDouble();
		}
		
		double money = 0;
		
		for(int i = 0; i < n; i++) {
		    money = arr[i] * 80 / 100;
		    System.out.println("$" + String.format("%.2f", money));
		}
	}
}
