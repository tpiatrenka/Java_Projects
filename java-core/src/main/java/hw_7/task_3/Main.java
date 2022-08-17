package hw_7.task_3;

//+
//Есть строка “Green. red. blue. yellow”. Необходимо заменить все точки на запятые
public class Main {
    public static void main(String[] args) {
        String string = "Green. red. blue. yellow";
        string = string.replace(".", ",");
        System.out.println(string);
    }
}
