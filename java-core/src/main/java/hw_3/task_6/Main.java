package hw_3.task_6;

//+
public class Main {
    //Есть массив чисел. Необходимо создать другой массив содержащий только четные элементы из первого
    public static void main(String[] args) {
        double[] myArray = new double[]{1,2,3,4,5,6,7,8};
        double[] evenArray = new double[(myArray.length + 1)/2];
        for (int i = 0; i < myArray.length; i+=2) {
            evenArray[i/2] = myArray[i];
            System.out.println(evenArray[i/2]); //можно в конце вывести весь получившийся массив, вне цикла
        }
    }

}
