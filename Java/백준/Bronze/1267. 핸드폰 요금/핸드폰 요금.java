import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sumY = 0, sumM = 0;
		for(int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		int[] arrY = arr.clone();
 		int[] arrM = arr.clone();
		
		for (int i = 0; i < n; i++) {
            sumY += (arr[i] / 30 + 1) * 10;  // 영식 요금제 계산
            sumM += (arr[i] / 60 + 1) * 15;  // 민식 요금제 계산
        }
        
	   	if (sumM == sumY)
		    System.out.print("Y M " + sumM);
		else if (sumM < sumY)
		    System.out.print("M " + sumM);
	    else
	        System.out.print("Y " + sumY);
	}
}
