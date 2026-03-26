public class CarsAssemble {
    static int producedCarPerHour = 221;
    double output = 0;
    int workingItems = 0;
    public double productionRatePerHour(int speed) {
        if (speed >= 1 && speed <= 4) {
            output = speed * producedCarPerHour;
        } else if (speed >= 5 && speed <= 8) {
            output = speed * producedCarPerHour * 0.9;
        } else if (speed == 9) {
            output = speed * producedCarPerHour * 0.8;
        } else if (speed == 10) {
            output = speed * producedCarPerHour * 0.77;
        } else {
            output = 0;
        }
        return output;
    }

    public int workingItemsPerMinute(int speed) {
        return workingItems = (int) (productionRatePerHour(speed) / 60);
    }
}
