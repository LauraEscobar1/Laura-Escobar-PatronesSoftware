public class IrrigationSystem {

    // unique instance
    private static IrrigationSystem instance;

    // attribute
    private boolean pumpOn;

    // private constructor
    private IrrigationSystem() {
        pumpOn = false;
    }

    // get the single instance
    public static IrrigationSystem getInstance() {
        if (instance == null) {
            instance = new IrrigationSystem();
        }
        return instance;
    }

    // methods
    public void turnOnPump() {
        pumpOn = true;
        System.out.println("Pump ON");
    }

    public void turnOffPump() {
        pumpOn = false;
        System.out.println("Pump OFF");
    }
}