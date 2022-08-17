package hw_2.task_5;

//+-
public class Main {
    //Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
    //для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
    public static void main(String[] args) {
        int inch = 1; //может быть объявлена в определении цикла 
        float cm = 0;
        for(inch = 1; inch <= 20; inch++){
            cm +=2.54; //2.54 можно вынести в отдельную переменную. Стараемся избегать в коде числа, они называются Magic number 
            System.out.println( inch + " inch " + "is " + cm + " cm");
        }
    }
}
