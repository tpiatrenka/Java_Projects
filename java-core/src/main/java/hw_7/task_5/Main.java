package hw_7.task_5;

import java.util.Arrays;

//+
//Есть массив слов. Нужно отфильтровать его так, чтобы в выходном массиве оказались слова, которые начинаются с буквы “W”/”w”.
public class Main {
    public static void main(String[] args) {
        String[] string = {"week", "flower", "gold", "Wesley", "wrong", "today", "plot"};
        String filtered = "";
        for (int i = 0; i < string.length; i++) {
            if (string[i].toLowerCase().startsWith("w")) {
                filtered = filtered.concat(string[i] + ","); //хитрый ход :) но когда речь идет о нескольких конкатенациях, лучше использовать билдер или баффер
            }
        }
        String[] filteredArray = filtered.split(",");
        System.out.println(Arrays.toString(filteredArray));
    }
}
