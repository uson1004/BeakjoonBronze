import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i <= a; i++) {
            if (i == a)
                System.out.print(i + " Go!");
            else if (i % 6 == 0)
                System.out.print(i + " Go! ");
            else
                System.out.print(i + " ");
            
        }
    }
}