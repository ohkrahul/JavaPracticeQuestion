import java.util.Scanner;

class AreaOfRectangle {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Your Height : ");
         double height = input.nextDouble();
         System.out.print("Enter Your Base : ");
         double Base = input.nextDouble();

         double Area = (height * Base)/2;
         System.out.println("Your Area of triangle is : " + Area);



     }
}
