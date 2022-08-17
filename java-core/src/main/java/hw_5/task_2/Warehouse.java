package hw_5.task_2;

import java.util.Arrays;

//+
public class Warehouse {
    private int index = 0;
    private int[] myInt;

    public Warehouse(int[] myInt) {
        this.myInt = myInt;
    }
    public int next(){
        if (index >= myInt.length){
            index = 0;
        }
        return myInt[index++];
    }
    
    //только следует убрать этот метод (смотри комментарий в Main)
    public int[] getArray(){
        return myInt;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "myInt=" + Arrays.toString(myInt) +
                '}';
    }
}
