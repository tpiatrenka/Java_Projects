package hw_3.task_8;

import java.util.Scanner;

public class Main {
    //Нарисовать на консоли бабочку. Пример вывода в butterfly.png
    //Как пользователь, я бы хотел иметь возможность задать размер бабочки (высоту и ширину)
    public static void main(String[] args) {

        int[] myArray = new int[] {1,2,3,4,5,6,7,8,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input butterfly height: ");
        int height = scanner.nextInt();
        if (height > 9 || height < 2) {
            System.out.println("Invalid height");
            return;
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if(j<=i){
                    System.out.print(myArray[j]);
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < height; j++) {
                if(j >= height - i - 1){
                    System.out.print(myArray[height - j - 1]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = height - 2; i >= 0; i--) {
            for (int j = 0; j < height; j++) {
                if(j<=i){
                    System.out.print(myArray[j]);
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < height; j++) {
                if(j >= height - i - 1){
                    System.out.print(myArray[height - j - 1]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
