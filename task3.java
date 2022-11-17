//Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
//положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.


import java.util.Scanner;
public class program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();
        if (a>=0) {
            System.out.println("positive number");
        } else {
            System.out.println("negativ number");
        }
        in.close();
    }
}
