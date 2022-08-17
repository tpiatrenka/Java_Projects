package hw_4.task_1;

import java.util.Objects;

//+
public class Person {
    /*Создайте класс, у которого будут поля имя и возраст (на англ), обязательно сделайте их приватными.
    У класса должен быть конструктор, который принимает в виде аргументов эти два поля и конструктор без аргументов,
    который присваивает значения по умолчанию для имени и возраста. Добавьте методы, при помощи которых можно
    получить имя и возраст. Создайте метод show(), чтобы он выводил на экран имя и возраст в читаемом формате
     */
    private String name;
    private Integer age;

    private static String text = "Hello from static";

    public static void print() {
        System.out.println(text);
    }

    public static void setText(String text) {
        Person.text = text;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(){
        this("Unknown", null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public String show() {
       return "The name is " + this.name + ". The age is " + this.age;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(this.name, person.name) && Objects.equals(this.age, person.age);
    }

    public int hashCode() {
        return Objects.hash(name);
    }
}
