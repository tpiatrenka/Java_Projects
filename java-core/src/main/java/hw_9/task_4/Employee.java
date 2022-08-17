package hw_9.task_4;

import java.io.Serializable;

//+ при Serializable хорошая привычка добавлять serialVersionUID
public class Employee implements Serializable {
    private String name;
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
