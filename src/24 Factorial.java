import java.util.Scanner;

class Factorial {
     public static void main(String[] args) {
         System.out.println("Welcome to Factorial");
         Scanner input = new Scanner(System.in);
         System.out.println("Enter Your Number :");
         int num = input.nextInt();
         long fact = factorial(num);
         System.out.println("Your Factorial is : " + fact);
     }

    public static long factorial(int num){
         if(num < 2){
             return 1;
         }
        long fact = 1;
         int i =2;
         while (i <=num){
             fact *= i;
             i++;
         }


         return fact;
    }
}