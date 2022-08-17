package hw_9.task_5;

import java.io.Serializable;

//+
public class Employee implements Serializable {
    private static final long serialVersionUID = 4679761422560298695L;
    public String name;
    private int age;
    private Work work;

    public Employee(String name, int age, Work work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work=" + work +
                '}';
    }
}
