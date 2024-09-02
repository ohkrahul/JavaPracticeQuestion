import java.util.Scanner;

class SumOfDigit {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter your num : ");
         int num = input.nextInt();
         int sum = Sum(num);
         System.out.println("Your sum is : "+ sum);
     }

    public static int Sum(int num) {

         int sum = 0;
         while (num > 0){

             sum += num % 10;
             num = num / 10;
         }
         return sum;

    }
}
