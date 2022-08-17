package hw_8.task_4;

//+ Очень стабильная машинка :D
public class WashingMachine {
    private boolean waterPresent = false;

    public void start() {
        try {
            waterPresent = true;
            throw new ElectricityOutage();
        } catch (ElectricityOutage e) {
            System.out.println("пропало электричество");
        } finally {
            drain();
        }
    }

    public void drain() {
        System.out.println("слив воды");
        waterPresent = false;
    }
}
