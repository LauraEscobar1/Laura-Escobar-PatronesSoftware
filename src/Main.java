public class Main {

    public static void main(String[] args) {
        irrigationSystem system1 = irrigationSystem.getInstance();
        system1.turnOnPump();

        irrigationSystem system2 = irrigationSystem.getInstance();

        if (system1 == system2) {
            System.out.println("Sistema de Riego para el campo");
        }
    }
}