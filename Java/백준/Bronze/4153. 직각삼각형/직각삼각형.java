import java.util.*;
import java.lang.Math;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int list[] = new int[3];
		
		int k = 0;

		while(true) {
		    list[0] = sc.nextInt();
		    list[1] = sc.nextInt();
		    list[2] = sc.nextInt();
		    
		    Arrays.sort(list);
    		
    		if(list[0] == 0 && list[1] == 0 && list[2] == 0) break;
    		else if((list[0] * list[0]) + (list[1] * list[1]) == (list[2] * list[2]))
    		    System.out.println("right");
    		else
    		    System.out.println("wrong");
    		k++;
		}
	}
}
