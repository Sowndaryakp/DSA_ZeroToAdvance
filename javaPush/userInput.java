package javaPush;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        int x ;
        int y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("value of x & y: " + x + " " + y);
        sc.close();
    }
    
}
