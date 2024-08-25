import java.util.Scanner;

class ArthmeticOperation {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter your first Num : ");
         int a = input.nextInt();
         System.out.print("Enter your Second Num : ");
         int b = input.nextInt();

         System.out.println("A + b is "+  (a + b));
         System.out.println("A - b is "+  (a - b));
         System.out.println("A * b is "+  (a * b));
         System.out.println("A / b is "+  (a / b));
         System.out.println("A % b is "+  (a % b));



     }
}
