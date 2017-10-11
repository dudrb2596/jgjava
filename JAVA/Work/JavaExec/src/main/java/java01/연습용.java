package java01;

import java.util.Scanner;

public class 연습용 {
 public static void main(String[] args){
     
     int x = 0;
     int y = 0;
     int z = 0;
     
     Scanner keyboard = new Scanner(System.in);
     
     System.out.print("첫번째수를 입력하세요 :");
     x = keyboard.nextInt();
     System.out.print("두번째수를 입력하세요 :");
     y = keyboard.nextInt();
     System.out.print("세번째수를 입력하세요 :");
     z = keyboard.nextInt();
     
     if(x>y&&x>z){
         
     }
     else if(y>z){
     }
     else{

         System.out.println("입력받은가장작은수 :" + x);
         
     }
 }
}