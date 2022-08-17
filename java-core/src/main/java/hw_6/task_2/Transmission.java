package hw_6.task_2;
//У коробки передач должны быть методы “переключить передачу выше” и “переключить передачу ниже”.
//Нельзя понизить передачу ниже 0 и повысить больше 7.
public class Transmission {
    private int speedLevel = 0;

    public int getSpeedLevel() {
        return speedLevel;
    }
    public void addSpeedLevel(){
        if(speedLevel > 7){ return;}
        speedLevel++; //передача может стать 8
    }
    public void reduceSpeedLevel(){
        if(speedLevel < 0) {return;}
        speedLevel--; //передача может стать -1
    }
}
