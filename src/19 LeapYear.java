import java.util.Scanner;

class LeapYear {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter your num :");
         int num = input.nextInt();

         if ((num%4==0 && num%100!=0)|| (num%400==0)){
             System.out.println(num+" Its a leap Year");
         } else {
             System.out.println("Its not a leap year");
         }
     }
}
