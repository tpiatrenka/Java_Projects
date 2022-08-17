package hw_7.task_7;

import java.util.Arrays;

//+ У тебя получился склад двигателей, но уже обсудили, как можно сделать
// Кстати, код не отформатирован
//Есть склад авто и выяснилось, что всем присвоили неверные маркировки двигателя.
//Необходимо все 1.4 литра двигатели заменить на 2.0Т, а все 1.8, на 1.8Т.
public class Main {
    public static void main(String[] args) {
        String[] engine = {"1.4","1.6", "1.5", "1.8","1.4","1.8","2.0","2.4"};

        for (int i = 0; i < engine.length; i++) {
            if(engine[i].equals("1.4")){engine[i] = "2.0T"; }
            if(engine[i].equals("1.8")){engine[i] = "1.8T";}
        }
        System.out.println(Arrays.toString(engine));
    }
}
