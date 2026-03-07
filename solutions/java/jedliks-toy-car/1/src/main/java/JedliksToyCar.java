public class JedliksToyCar {
    int driveCount = 0;
    int battery =100;
    public static JedliksToyCar buy() {
       return new JedliksToyCar();
    }

    public String distanceDisplay() {
              int count = driveCount;
        return String.format("Driven %d meters",count);
    }

    public String batteryDisplay() {
                int currentBattery = battery;

        if (battery == 0) {
            return "Battery empty";
        }
        return String.format("Battery at %d%%",currentBattery);
    }

    public void drive() {
        if (battery != 0) {
            driveCount +=20;
            battery -= 1;
            return;
        }
        System.out.println("Battery empty");
    }
}
