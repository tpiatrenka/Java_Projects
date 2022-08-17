package hw_7.task_2;

//+
//Есть слово “alucard”. Нужно изменить порядок букв на обратный
public class Main {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("alucard"); //переменная называется строка, а тип билдер - может сбивать с толку
        StringBuilder reverseStr = string.reverse(); //когда делаешь string.reverse(), в переменной string уже нужное значение
        System.out.println(reverseStr);
    }
}
