import java.util.Scanner;

class PerimeterOfRectangle {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Num : ");
         double a = input.nextDouble();
         double b = input.nextDouble();
         double c = input.nextDouble();
         double d = input.nextDouble();

         double perimeter= (a + b + c + d);

         System.out.println("Perimeter of Rectangle : "+ perimeter + "cm");


     }
}
