import java.util.*;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = 0;
		String c = "";
		String str2 = "";
		
		for(int i = 0; i < a; i++) {
		    str2 = "";
		    b = sc.nextInt();
		    c = sc.next();
		    
		    for(int j = 0; j < c.length(); j++) {
		        str2 += c.substring(0+j, 1+j).repeat(b);
 		        
		    }
		    System.out.println(str2);
		}
	}
}
