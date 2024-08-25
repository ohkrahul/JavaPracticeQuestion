import java.util.Scanner;

class SimpleInterest {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Your Principle amount : ");
         int principle = input.nextInt();
         System.out.print("Enter Your Rate : ");
         float rate = input.nextFloat();
         System.out.print("Enter Your Time : ");
         float years = input.nextFloat();

         float interest = (principle * rate * years) / 100;

         System.out.print("Yout total Interest is :" + interest);


     }
}
