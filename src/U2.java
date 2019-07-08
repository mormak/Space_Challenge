import java.util.Random;

public class U2 extends Rocket {

    public U2 (){
        cost = 120;
        weight = 18000;
        maxWeight = 29000;
        launchExplosion = 0.0;
        landingCrash = 0.0;
        currentWeight = weight;
        countRockets = 0;
    }

    @Override
    public boolean launch() {
        Random rand = new Random();
        int num = rand.nextInt(100);
        num += 1;

            System.out.println("\nStart następnej rakiety U2.");
            //System.out.println("Start " + countRockets + " rakiety U2.");

        this.launchExplosion = 4.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);

        if (this.launchExplosion >= num){
            System.out.println("Rakieta U2 uległa destrukcji!");
            return false;
        } else {
            System.out.println("Rakieta U2 wystartowała!");
            return true;
        }
    }

    @Override
    public boolean land() {
        Random rand = new Random();
        int num = rand.nextInt(100);
        num += 1;
        System.out.println("Lądowanie rakiety U2!");

        this.landingCrash = 8.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        if (this.launchExplosion >= num){
            System.out.println("Rakieta U1 uległa destrukcji!");
            return false;
        } else {
            System.out.println("Rakieta U1 wylądowała!");
            return true;
        }
    }
}