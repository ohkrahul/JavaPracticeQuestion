import java.util.Scanner;

class Prime {
     public static void main(String[] args) {
         Scanner input  = new Scanner(System.in);
         System.out.println("Enter your num : ");
         int num = input.nextInt();
         boolean isPrime = isprime(num);
         if (isPrime){
             System.out.println("Your num is prime");
         } else {
             System.out.println("Your num is not prime");
         }
     }

     public static boolean isprime(int num){
         int i =2;
         while (i < num){
             if (num % i == 0){
                 return false;
             }
             i++;
         }
         return true;
     }
}
