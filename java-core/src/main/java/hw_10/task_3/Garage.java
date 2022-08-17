package hw_10.task_3;

//+-
public class Garage<C extends Car> {
    //Не используются дженерики в поле - можно в гараж для Лады закинуть БМВ - это всё Car
    private Car car;

    public void putCarInside(C car) {
        this.car = car;
    }
}
