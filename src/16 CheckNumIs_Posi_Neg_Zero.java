import java.util.Scanner;

class CheckNumIs_Posi_Neg_Zero {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Your Number :");
         int num = input.nextInt();

         if(num > 0){
             System.out.println("Num is positive");
         }else if(num < 0){
             System.out.println("Num is negetive");
         }else {
             System.out.println("num is zero");
         }
     }
}
