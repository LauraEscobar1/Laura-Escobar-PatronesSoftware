public class Main {

    public static void main(String[] args) {

        IrrigationSystem system1 = IrrigationSystem.getInstance();
        system1.turnOnPump();

        IrrigationSystem system2 = IrrigationSystem.getInstance();

        if (system1 == system2) {
            System.out.println("Same irrigation system");
        }
    }
}