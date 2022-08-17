package hw_2.task_3;

//+
public class Main {
   // Вычислить: 1+2+4+8+...+256
    public static void main(String[] args) {
        int sum = 1;
        for(int i = 2; i <= 256; i *= 2){
            sum+=i;
        }
        System.out.println(sum);
    }
}
