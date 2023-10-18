package Seminar2;

//Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.

public class task3 {
    public static void main(String[] args) {
        int [] array = {1, 3, 0, 0, 0, 6};
        System.out.println(twoZero(array));
    }

    /**
     * Функция, возвращающая истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
     * @param array подаваемый массив
     * @return результат проверки на два соседних нулевых значения в массиве
     */
    public static boolean twoZero (int[] array){
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == 0 && array[i] == 0){
                return true;

            }
        }
        return false;
    }
}
