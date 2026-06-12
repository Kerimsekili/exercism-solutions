public class ExperimentalRemoteControlCar implements RemoteControlCar{

    int distance = 0;

    @Override
    public void drive() {
        distance = distance + 20;
    }

    @Override
    public int getDistanceTravelled() {
        return distance;
    }
}
