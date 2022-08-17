package hw_3.task_4;

//+
public class Main {
    //При помощи двумерного массива вывести на экран таблицу умножения
    public static void main(String[] args) {
        int[][] multiple = new int[9][9];

        for (int i = 0; i < multiple.length; i++) {
            for (int j = 0; j < multiple.length; j++) {
                multiple[i][j] = (i + 1) * (j + 1);
                System.out.print(multiple[i][j] + " ");
                if (multiple[i][j] < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
