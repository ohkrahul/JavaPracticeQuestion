import java.util.Scanner;

class MultiplicationTable {
     public static void main(String[] args) {
    int num =TableNum();
         int i =1;
         while(i<=10){
             System.out.println(num + " X "+ i +" = " + (num*i));
             i++;
         }
     }


     public  static int TableNum(){
         Scanner input = new Scanner(System.in);

         System.out.print("Enter your num :");

         int num = input.nextInt();

         return num;

     }




}
