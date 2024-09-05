import java.util.Scanner;

class ArmstrongNumber {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Please Enter your num: ");
         int num = input.nextInt();
         boolean isArmstrong = isArmstrong(num);
         if (isArmstrong){
             System.out.println("your num is armstrong");
         } else {
             System.out.println("Your num is not Armstrong");
         }
     }

     public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigit(num);
        int numCopy = num;
        int finalNumber = 0;
        while (num > 0){
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, noOfDigits);

        }
         return finalNumber == numCopy;
     }

     public static int pow(int num1, int num2){
         int result = 1;
         int i =0;
         while (i < num2){
             result *= num1;
             i++;
         }
         return result;
     }

     public static int noOfDigit(int num){
         int digit = 0;
         while (num > 0){
             digit++;
             num /= 10;
         }
         return digit;
     }
}
