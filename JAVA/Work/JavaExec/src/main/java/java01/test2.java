package java01;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int grade = 95;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("성적을 입력하세요 :");
        int x = keyboard.nextInt();
        System.out.println("당신의 학점은 " + grade + "입니다.");
        
        System.out.println(x);
        
        if(x>=90){
            System.out.println("A");
        }
        else if (x>=80){
            System.out.println("B");            
        }
        else if (x>=70){
            System.out.println("C");
        }
        else if (x>=60){
            System.out.println("D");
        }
        else
            System.out.println("F");
    }
}
