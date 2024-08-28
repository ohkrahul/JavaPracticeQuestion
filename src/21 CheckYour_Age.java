import java.util.Scanner;

class CheckYour_Age {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter you age :");
         int age = input.nextInt();

         if (age>= 60){
             System.out.println("You are Senior person");
         } else if (age >=20) {
             System.out.println("You are Adult person");
         } else if (age >=13) {
             System.out.println("You are Teenager");
         } else {
             System.out.println("You are a child");
         }
     }
}
