package hw_5.task_3;

//+-
public class Main {
    public static void main(String[] args) {
        CountryHouse h = new CountryHouse(2, 3); //название переменной должно быть более понятным
        TowerBlock b = new TowerBlock(5, 20); //название переменной должно быть более понятным
        ListOfHouses list = new ListOfHouses(new TypesOfBlocksAndHouses[]{h, b});
    }
}
