package hw_6.task_2;
//+ Но, возможно, код не отформатирован 
// мотора должны быть методы “заглушить мотор” и “завести мотор”.
//Если попробовать завести работающий мотор, то вывести на экран, что мотор уже работает.
//Если заглушить не работающий мотор, то вывести на экран, что мотор уже заглушен
public class Motor {
    private boolean isOn = false;

    public boolean isMotorOn(){
        return isOn;
    }
    public void startMotor(){
        if (isOn){
            System.out.println("мотор уже работает");
        }
        isOn = true;
    }
    public void stopMotor(){
        if(!isOn){
            System.out.println("мотор уже заглушен");
        }
        isOn = false;
    }
}
