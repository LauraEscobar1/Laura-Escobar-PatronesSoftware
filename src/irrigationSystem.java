public class irrigationSystem {

    private static irrigationSystem instance;

    private boolean pumpOn;

    private irrigationSystem() {
        pumpOn = false;
    }

    public static irrigationSystem getInstance() {
        if (instance == null) {
            instance = new irrigationSystem();
        }
        return instance;
    }

    public void turnOnPump() {
        pumpOn = true;
        System.out.println("Pump ON");
    }

    public void turnOffPump() {
        pumpOn = false;
        System.out.println("Pump OFF");
    }
}