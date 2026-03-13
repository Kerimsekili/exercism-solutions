class NeedForSpeed {
    int speed;
    int batteryDrain;
    int battery;
    int distance;
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        battery = 100;
    }

    public int drive() {
        battery = battery - batteryDrain;
        if (battery >= 0) {
            distance += speed;
            return speed;
        }
        return 0;
    }

    public int distanceDriven() {
        return distance;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int maxDrives = 100 / car.batteryDrain;
        int maxDistance = maxDrives * car.speed;

        return maxDistance >= distance;
    }
}
