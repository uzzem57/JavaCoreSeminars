package Seminar2;

//Написать метод, возвращающий количество чётных элементов массива.
// countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0

public class task1 {
    public static void main(String[] args) {
        int [] array = {2, 1, 2, 3, 4};
        System.out.println("Количество чётных элементов массива - " + countElements(array));
    }

    /**
     * Метод возвращает количество четных элементов массива
     * @param array заданный массив
     * @return количество четных элементов массива
     */
    public static int countElements (int [] array){
        int countelements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                countelements ++;
            }
        }

        return countelements;
    }
}