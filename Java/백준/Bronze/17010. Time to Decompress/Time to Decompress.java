import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr1[] = new int[n];
		String arr2[] = new String[n];
		
		for(int i = 0; i < n; i++) {
		    arr1[i] = sc.nextInt();
		    arr2[i] = sc.nextLine();
		}
		for(int i = 0; i < n; i++) {
		    String result = arr2[i].repeat(arr1[i]).replaceAll(" ", "");
		    System.out.println(result);
		}
	}
}
