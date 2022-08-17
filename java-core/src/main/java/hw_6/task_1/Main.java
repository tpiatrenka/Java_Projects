package hw_6.task_1;
//+
//Написать рекурсивную функцию, которая бы перебирала все элементы массива и выводила их на экран
public class Main {
    public static void main(String[] args) {
        Integer[] mass = new Integer[]{1,2,3,4,5};
        recursion(mass,0);
    }

    public static void recursion(Integer[] array, Integer index){
        if(index >= array.length){ return; } //тело цикла лучше начинать с новой строки 
        System.out.println(array[index]);
        recursion(array, index + 1);
    }
}

