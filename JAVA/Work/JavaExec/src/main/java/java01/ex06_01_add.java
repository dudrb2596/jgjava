package java01;

import java.util.Scanner;

public class ex06_01_add {
    public static int getSum(int start, int end){
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("정수");
        int x = keyboard.nextInt();
        
        System.out.println("정수2");
        int y = keyboard.nextInt();
        
        int sum =0;
        for(int i =0; i<=end; i=i+1){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        
        int sum = getSum(1, 10);
        System.out.println("1부터 ~10까지" + sum);
    }
}
