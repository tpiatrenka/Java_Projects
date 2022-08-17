package hw_3.task_2;

//+ 
public class Main {
    //Есть массив чисел. Найти среднее арифметическое число элементов массива

    public static void main(String[] args) {
        double[] myArray = new double[]{1,2,3,4,5,6,7,8,9};
        double sum = 0;
        double mean = 0; //чаще для среднего арихметического употребляется слово average
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        mean = sum / myArray.length;
        System.out.println(" The mean of the array is: " + mean);
    }
}
