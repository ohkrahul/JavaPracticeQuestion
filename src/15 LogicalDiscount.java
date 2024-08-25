import java.util.Scanner;

class LogicalDiscount {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter your Age :");
         int age = input.nextInt();

         System.out.println("Are you a female? (True/False) ");
         boolean isFemale = input.nextBoolean();

         if (age < 5){
             System.out.println("You got 75% Discount");
         } else if(isFemale){
             System.out.println("You got 50% Discount");
         } else if (age > 60 && !isFemale) {
             System.out.println("You got 25% Discount");

         }else {
             System.out.println("You got no Discount");
         }

     }
}
