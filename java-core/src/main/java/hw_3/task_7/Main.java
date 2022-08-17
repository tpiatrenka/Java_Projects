package hw_3.task_7;

//+ Да, так тоже можно
public class Main {
    //Есть целочисленный неотсортированный массив. Отсортируйте его "пузырьком".
    // Попробуйте сами написать и затем посмотрите реализацию
    public static void main(String[] args) {
        double[] myArray = new double[]{8,7,6,10,4,3,2,1};
        double temp = 0;
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = 0; j < myArray.length - 1 - i; j++) {
                if(myArray[j] > myArray[j + 1]){
                    temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
