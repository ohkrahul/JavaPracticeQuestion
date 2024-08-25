import java.util.Scanner;

class Fahrenheit_Celsius {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter Your temp in  F :");
         float f = input.nextFloat();

         float cel = (f - 32 ) * 5.0f / 9.0f;
         System.out.println("Your cel is :"+ cel + "C");




     }
}
