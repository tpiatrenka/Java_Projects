package hw_3.task_3;

//+ Код не отформатирован
public class Main {
    //Есть массив чисел. Заменить каждый нечетный элемент массива на 0.
    public static void main(String[] args) {
        double[] myArray = new double[]{1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] % 2 == 1) {
                myArray[i] = 0;
            }

            System.out.println(myArray[i]);
        }
//лишняя пустая строчка
    }
}
