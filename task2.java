//Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
//(включительно), если да – вернуть true, в противном случае – false.


import java.util.Scanner;
public class program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();
        System.out.print("Input b number: ");
        int b = in.nextInt();
        boolean sum = a+b>9 && a+b <21;
        System.out.println(sum);
        in.close();
    }
}