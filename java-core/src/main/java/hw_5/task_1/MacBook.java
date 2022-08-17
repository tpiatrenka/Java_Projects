package hw_5.task_1;
//Есть интерфейс Computer,у которого есть методы включить, выключить и резет. Создайте класс, который бы имплементировал
//этот интерфейс
//+
public class MacBook implements Computer{
    @Override
    public void turnOn() {
        System.out.println("turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("turnOff");
    }

    @Override
    public void reset() {
        System.out.println("reset");
    }
}
