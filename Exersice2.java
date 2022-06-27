package Exersises;
import java.util.ArrayList;
import java.util.Arrays;

//Введите одномерный целочисленный массив. Найдите наибольший нечетный элемент.
// Далее трижды осуществите циклический сдвиг влево элементов, стоящих справа от найденного максимума,
// и один раз сдвиг элементов вправо, стоящих слева от найденного максимума.
public class Exersice2 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 3, 9, 9, 1, 1, 101, 5, 51};
        int max=0, maxIndex=0, count=0;

        for (int x=0; x<array.length; x++) {
            if ( (array[x] % 2 !=0) && (array[x] > max) ) {
                max = array[x];                                          // Наибольший нечетный елемент
                maxIndex = x;
            }
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i=(maxIndex+1); i<array.length; i++) {
            numbers.add(array[i]);
            count++;
        }

        for (int j=maxIndex; j>=0; j--) {
            array[j+2] = array[j];
        }
        for (int q=0; q<count; q++) {
            array[q] = numbers.get(q);
        }
        System.out.println(Arrays.toString(array));


    }
}
