import java.util.Scanner;

class LoopPatttern {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter your num : ");
         int rows  = input.nextInt();
         printFirstPattern(rows);
         reverseRightHalfPyramid(rows);
         leftHalfPyramid(rows);
     }

    public static void leftHalfPyramid(int maxRows){
        System.out.println("\nHere is the  left pyramid");
        int rows = maxRows;
        while (rows > 0){
             //this loop prints spaces
            int j = 0;
            while (j < rows - 1){
                System.out.print("  ");
                j++;
            }

            // this loop prints star
            int i =0;
            while (i <= (maxRows-rows)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

     public static void reverseRightHalfPyramid(int maxRows){
         System.out.println("\nHere is the reverse right pyramid");
         int rows = maxRows;
         while (rows > 0){
             int i =0;
             while (i < rows){
                 System.out.print(" *");
                 i++;
             }
             System.out.println();
             rows--;
         }
     }
     public static void printFirstPattern(int maxRows){
         System.out.println("\nHere is the right pyramid");
//         int rows = maxRows;
         int rows = 0;
         while (rows < maxRows){
             System.out.print("*");
             int i = 0;
             while (i < rows){
                 System.out.print(" *");
                 i++;
             }
             System.out.println();
             rows++;
         }
     }
}
