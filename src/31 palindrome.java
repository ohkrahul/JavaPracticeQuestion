import java.util.Scanner;

class palindrome {
     public static void main(String[] args) {
         Scanner input =  new Scanner(System.in);
         System.out.print("Enter your num : ");
         int num = input.nextInt();
         boolean isPalindrom = isPalindrome(num);
         if (isPalindrom){
             System.out.println("Your num is palindrom");
         }
         else {
             System.out.println("Your num is palindrom");

         }
     }

     public static boolean isPalindrome(int num){
//         int reverse = reverse(num);
//         return num == reverse;
//         or
         return num == reverse(num);
     }


     public static int reverse(int num){
         int newNum = 0;
         while (num > 0){
             int digit = num % 10;
             newNum = newNum * 10 + digit;
             num /= 10;
         }
         return newNum;
     }
}
