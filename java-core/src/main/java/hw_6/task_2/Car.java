package hw_6.task_2;
//+, но проверь форматирование кода, пожалуйста 
//Есть класс автомобиль. У автомобиля есть коробка передач и  мотор.
//У мотора должны быть методы “заглушить мотор” и “завести мотор”.
//Если попробовать завести работающий мотор, то вывести на экран, что мотор уже работает.
//Если заглушить не работающий мотор, то вывести на экран, что мотор уже заглушен
//У коробки передач должны быть методы “переключить передачу выше” и “переключить передачу ниже”.
//Нельзя понизить передачу ниже 0 и повысить больше 7.
//
//Машина должна уметь ездить, т.е. надо завести мотор, включить первую передачу и нажать газ.
//Машина не может поехать, если не заведен мотор.
//Когда машина едет, то пускай выведет на экран текущую скорость
//
//Скорость = текущая_передача * 20
public class Car {
    private Transmission transmission;
    private Motor motor;

    public Car(Transmission transmission, Motor motor) {
        this.transmission = transmission;
        this.motor = motor;
    }

    public void startMotor(){
        motor.startMotor();
    }
    public void stopMotor(){
        motor.stopMotor();
    }
    public void addSpeedLevel(){
        transmission.addSpeedLevel();
    }
    public void reduceSpeedLevel(){
        transmission.reduceSpeedLevel();
    }
    public void drive(){
        if (!motor.isMotorOn()){
            System.out.println("не заведен мотор");
            return;
        }
        System.out.println("скорость " + transmission.getSpeedLevel()*20);
//Лишняя пустая строка 
    }
//Лишняя пустая строка 
}
