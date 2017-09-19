package java01;

import java.util.Scanner;

public class jv01_02_Scanner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("정수");
        int x = keyboard.nextInt();
        
        System.out.print("문자");
        String y = keyboard.next();
        
        
    }
    
}
