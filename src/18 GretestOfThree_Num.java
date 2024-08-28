import java.util.Scanner;

class GretestOfThree_Num {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Enter your Num :");
         int num1 = input.nextInt();
         int num2 = input.nextInt();
         int num3 = input.nextInt();

         if(num1 >= num2 && num1 >= num3){
             System.out.println("Num1 is higest :" + num1);
         } else if ( num2 >= num3) {
             System.out.println("Num2 is highest :"+ num2 );
         } else {
             System.out.println("Num3 is highest :" + num3);
         }
     }
}
