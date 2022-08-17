package hw_9.task_4;

import java.io.Serializable;

//+ (serialVersionUID)
public class Work implements Serializable {
    private String name;
    private int experience;

    public Work(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Work{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
