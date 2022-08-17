package hw_10.task_3;

//+
//Есть 3 типа гаражей:
//        1. Могут храниться только BMW
//        2. Могут храниться только Lada
//        3. Могут храниться все авто
//        Придумайте такой класс и создайте 3 типа гаражей, используйте generics
public class Main {
    public static void main(String[] args) {
        Garage<BMW> garageForBMW = new Garage<>();
        Garage<Car> genericGarage = new Garage<>();
        Garage<LadaCar> garageForLada = new Garage<>();

        BMW bmw = new BMW();
        LadaCar lada = new LadaCar();

        garageForBMW.putCarInside(bmw);
        garageForLada.putCarInside(lada);

        genericGarage.putCarInside(bmw);
        genericGarage.putCarInside(lada);
    }
}
