import java.util.Scanner;

class function {
     public static void main(String[] args) {
//         printStars();
//         greet();
//         AskUserInfo();

         System.out.println(paraFun(3,2));
         System.out.println(paraFun(-2,2));

//         int num1 = AskUserInfo();
//         int num2 = AskUserInfo();
//
//         int sum = num1+num2;
//         System.out.print("Total sum is " + sum);
     }

     public  static void printStars(){
//         System.out.println("*");
//         System.out.println("* *");
//         System.out.println("* * *");
//         System.out.println("* * * *");
//         System.out.println("* * * * *");
//         System.out.println("* * * * * *");
         int rows = 0;
         while (rows < 10){
             System.out.print("*");

             int i=0;
             while (i<rows){
                 System.out.print(" *");
                 i++;
             }
             System.out.println();
             rows++;

         }
     }

     public static int AskUserInfo(){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter your number: " );
         int firstNum = input.nextInt();
         return firstNum;
     }
     public static void greet(){
         System.out.println("hey rahul");
     }

     public static int paraFun(int firstNum, int secondNum){
         System.out.println("First NUm : " + firstNum);
         System.out.println("Second NUm : "+ secondNum);
         return firstNum + secondNum;

     }
}
