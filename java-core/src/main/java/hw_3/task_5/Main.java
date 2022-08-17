package hw_3.task_5;

//+
public class Main {
    //Есть массив чисел, нужно инвертировать его порядок, т.е. массив [0,1,2,3,4] -> [4,3,2,1,0]
    public static void main(String[] args) {
        double[] myArray = new double[]{1,2,3,4,5,6,7,8,9};
        double temp = 0;
        for (int i = 0; i < myArray.length/2; i++) {
            temp = myArray[i];
            myArray[i]= myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = temp;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
