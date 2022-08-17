package hw_2.task_2;

//+ Немного поехали комментарии
public class Main {
    public static void main(String[] args) {
      //  Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
        //        сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
        int numOfCells = 1;
        for(int i = 1; i <= 24; i = i+3){
            numOfCells = numOfCells*2;
            System.out.println(numOfCells);
        }
    }
}
