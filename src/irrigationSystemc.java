public class irrigationSystemc {

    private static irrigationSystemc instance;

    private boolean pumpOn;

    private irrigationSystemc() {
        pumpOn = false;
    }

    public static irrigationSystemc getInstance() {
        if (instance == null) {
            instance = new irrigationSystemc();
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