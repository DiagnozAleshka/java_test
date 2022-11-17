/* Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
 если число отрицательное, и вернуть false если положительное. */
 import java.util.Scanner;
 public class program {

     public static void main(String[] args) {

         Scanner in = new Scanner(System.in);
         System.out.print("Input a number: ");
         int a = in.nextInt();
         boolean c = a >= 0;
         if (c==true) {
            System.out.println(false);
         } else{
            System.out.println(true);
         }

         in.close();
     }
 }