import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int result = n1 * n2 - n3;

        if (result > 0)
            System.out.print(result);
        else
            System.out.print(0);

	}
}
