package core;

import java.util.Scanner;

public class HackerRankStdinout {

    public static void main(String[] args) {
        
        // Write your code here.
        Scanner scanner = new Scanner(System.in);
        
        
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();
        
        scanner.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}