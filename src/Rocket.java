public class Rocket implements SpaceShip {

    static int cost;
    static int weight;
    int maxWeight;
    int currentWeight;
    int countRockets;
    double launchExplosion;
    double landingCrash;


    public boolean launch() {
        return true;//methods in the Rocket class should always return true.
    }

    public boolean land() {
        return true;//methods in the Rocket class should always return true.
    }

    public int carry(Item item) {
        this.currentWeight += item.getWeight();
        return this.currentWeight;
    }

    public boolean canCarry(Item item) {
        return this.currentWeight + item.getWeight() <= maxWeight;
    }

}