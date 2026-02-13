public class mainsystem {

    public static void main(String[] args) {

        irrigationSystemc system1 = irrigationSystemc.getInstance();
        system1.turnOnPump();

        irrigationSystemc system2 = irrigationSystemc.getInstance();

        if (system1 == system2) {
            System.out.println("Same irrigation system");
        }
    }
}