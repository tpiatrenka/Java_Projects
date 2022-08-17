package hw_7.task_4;

import java.util.Arrays;
import java.util.Locale;

//+
//Есть текст:
//“While major gameplay components are already in place and functioning,
//players help is needed to add some of the smaller features and content.
//Of course polishing the overall experience is important at the same time.
//Game has been extensively tested in closed group, but it is always important to hear fresh suggestions
//from larger crowd that come from various gaming backgrounds.
//Plan is to make the game as good as possible but without compromising the core idea.”
//
//Нужно узнать содержит ли текст слова “alert”, “add”, “good”, “plan” и какое кол-во.
public class Main {
    public static void main(String[] args) {
        int sumOfAlert = 0;
        int sumOfAdd = 0;
        int sumOfGood = 0;
        int sumOfPlan = 0;
        String string = "While major gameplay components are already in place and functioning,\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "Game has been extensively tested in closed group, but it is always important to hear fresh suggestions\n" +
                "from larger crowd that come from various gaming backgrounds.\n" +
                "Plan is to make the game as good as possible but without compromising the core idea.";
        string = string.toLowerCase().replace(".", " ").replace("\n", " ").replace(",", "");
        String[] split = string.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("alert")) {
                sumOfAlert++;
            }
            if (split[i].equals("add")) {
                sumOfAdd++;
            }
            if (split[i].equals("good")) {
                sumOfGood++;
            }
            if (split[i].equals("plan")) {
                sumOfPlan++;
            }
        }
        System.out.println("Слово alert встречается " + sumOfAlert + " раз");
        System.out.println("Слово add встречается " + sumOfAdd + " раз");
        System.out.println("Слово good встречается " + sumOfGood + " раз");
        System.out.println("Слово plan встречается " + sumOfPlan + " раз");
    }
}
