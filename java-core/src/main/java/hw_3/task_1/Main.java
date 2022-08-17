package hw_3.task_1;

import java.util.Scanner;

// + Только код не отформатирован
public class Main {
    public static void main(String[] args) {
        /*Создать массив из 3 элементов. При помощи класса сканер и пользователя заполнить его.
Вывести сумму, наименьшее и наибольшее из чисел на экран */
        double myArray[] = new double[3];
        double sum = 0; //лучше объявлять переменную ближе к использованию в программе
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++){ //лучше использовать поле length
            System.out.println("Enter the element of the array: ");
            myArray[i] =scanner.nextDouble();
        }
        double maxNumber = myArray[0];
        double minNumber = myArray[0];
        for (int i = 0; i < 3; i++) { //поле length и нулевой элемент уже обработан, только можно еще сумму его значением проинициализировать
            sum += myArray[i];
            if ( myArray[i] > maxNumber ) {
                maxNumber = myArray[i];
            } else if (myArray[i]< minNumber){
                minNumber = myArray[i];
            }
        }

        System.out.println("The sum of the elements is: " + sum);
        System.out.println("The max of the elements is: " + maxNumber);
        System.out.println("The min of the elements is: " + minNumber);
    }
}
