class ProductionRemoteControlCar implements RemoteControlCar,Comparable<ProductionRemoteControlCar> {
    int distance = 0;
    int numberOfVictories = 0;

    @Override
    public void drive() {
        distance = distance + 10;
    }

    @Override
    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

        @Override
    public int compareTo(ProductionRemoteControlCar data) {
        return   data.numberOfVictories - this.numberOfVictories;
    }
}
