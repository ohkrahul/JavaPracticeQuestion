import java.util.Scanner;

class OddEven {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.print("Enter you num :");
         int num = input.nextInt();

         if(num % 2 ==0){
             System.out.println("Num is even");
         } else{
             System.out.println("Num is odd");
         }
     }
}
