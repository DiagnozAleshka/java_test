/* Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
 и числа меньшие 6 умножить на 2; */
 public class program {

     public static void main(String[] args) {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int arrll = arr.length;
        for (int i = 0; i < arrll; i++) {
            if (arr[i]<6)
            arr[i] *= 2;

        }
        for (int i = 0; i < arrll; i++) {
            System.out.println(arr[i]);
        }

    }

    }