package hw_2.task_8;

//+
public class Main {
    /*Даны числа от 0 до 100.
- Посчитать сумму четных и вывести на экран
- Посчитать сумму нечетных и вывести на экран
- Найти общую сумму всех чисел
*/
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        int sum = 0;
        for (int i = 0; i <= 100; i+= 1) {
            if(i%2==0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
            sum += i;
        }
        System.out.println("Sum of even numbers is " + evenSum);
        System.out.println("Sum of odd numbers is " + oddSum);
        System.out.println("Sum of all numbers is " + sum);
    }
}
