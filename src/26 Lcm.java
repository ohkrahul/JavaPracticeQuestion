import java.util.Scanner;

class Lcm {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter your num : ");
         int first = input.nextInt();
         System.out.print("Enter your num : ");
         int second = input.nextInt();
         int lcm = LCM(first, second);
         System.out.println(" Lcm is : " + lcm);

     }

     public static int LCM(int first, int second){
         int i = 1;
         while (true){
             int factor = first * i;
             if (factor % second == 0){
                 return factor;
             }
             i++;
         }

     }
}
