package hw_10.task_1;
//+
public class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public void printType() {
        System.out.println(item.getClass().getName());
    }
}
