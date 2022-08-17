package hw_2.taks_4;

//+ Опечатка в названии пакета
public class Main {
    //Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int multi = 0;
        //Количество повтора цикла может быть оптимизировано, но это опционально 
        for (int i = 0; i < a; i++) {
            multi += b;
        }
        System.out.println(multi);
    }
}
