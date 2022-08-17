package hw_2.task_1;

//+
public class Main {
    public static void main(String[] args) {
        //  Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
        //  день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
        //  суммарный путь пробежит спортсмен за 7 дней?
        double currentDay = 10;
        double sum = currentDay;
        int i = 0;
        while (i < 6) {
            currentDay = currentDay*1.1;
            sum += currentDay;
            i++;
        }
        System.out.println(sum);
    }
}
