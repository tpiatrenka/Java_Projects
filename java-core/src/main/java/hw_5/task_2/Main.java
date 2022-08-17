package hw_5.task_2;
//сделать класс Warehouse, внутри которого массив (массив чего придумайте сами). Массив  должен быть immutable
//При создании объекта создается массив, заносятся в него данные, изменять или добавлять значения в массив после  этого  нельзя
//в классе должен быть метод next() который возвращает следующий элемент массива.
//Если дошли до последнего элемента при вызове next(), должно вернуть первый элемент
//также должен быть метод getArray() - который возвращает массив и переопределен метод toString()

//+- Смысл задания в том, чтобы скрыть массив и давать к нему доступ только через next(). В идеале было бы еще использовать массив не примитивов, а объектов и запретить их изменять (например, возвращать копию). 
//Из текста задания это не совсем понятно, да :) Попробуй сделать так, чтобы на складе лежали какие-то объекты, получить у ним доступ можно только по next() и их нельзя изменять. Доступ к массиву не давать 
public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(new int[]{1, 2, 3});

        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        System.out.println(warehouse);
        int[] array = warehouse.getArray();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
