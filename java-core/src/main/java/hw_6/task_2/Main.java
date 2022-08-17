package hw_6.task_2;
//+-
//Машина должна уметь ездить, т.е. надо завести мотор, включить первую передачу и нажать газ.
//Машина не может поехать, если не заведен мотор.
//Когда машина едет, то пускай выведет на экран текущую скорость
public class Main {
    public static void main(String[] args) {
        //Новые мотор и коробка могут создаваться в конструкторе машины, иначе можно передать параметры как null и все поломается
        Motor motor = new Motor();
        Transmission transmission = new Transmission();
        Car car = new Car(transmission,motor);

        car.addSpeedLevel();
        car.addSpeedLevel();
        car.startMotor();
        car.drive();
        car.stopMotor();
        car.drive();
    }
}
