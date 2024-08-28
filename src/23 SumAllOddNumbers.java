import java.util.Scanner;

class SumAllOddNumbers {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter your num :");

         int num = input.nextInt();
         int sumOdd = OddSum(num);


         System.out.println("sum of Odd is :"+ sumOdd);
     }

     public static int OddSum(int num){
         int i=1;
         int sum=0;

         while (i<=num){
             sum += i;
             i+=2;
         }
         return  sum;
     }
}
