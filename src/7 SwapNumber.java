import java.sql.SQLOutput;
import java.util.Scanner;

class SwapNumber {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter first num of a : ");
         int a = input.nextInt();
         System.out.print("Enter second num of b : ");
         int b = input.nextInt();

//         int a = 5;
//         int b = 10;
         int c = b;
         b = a;
         a = c;
         System.out.println("after swap a is : "+ a);
         System.out.println("after swap b is : "+ b);
     }
}
