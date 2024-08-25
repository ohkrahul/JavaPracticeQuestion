import java.util.Scanner;

class CompoundInterest {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter your Principle Amount in Rs :");
         double principle = input.nextDouble();
         System.out.println("Enter your Rate :");
         float rate = input.nextFloat();
         System.out.println("Enter how many years for you want :");
         float years = input.nextFloat();

         double Interest = principle * Math.pow((1 +rate / 100), years);

         System.out.println("Your Total compund interest is : "+ Interest);



     }
}
