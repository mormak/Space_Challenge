import java.util.Random;

public class U1 extends Rocket {

    public U1 (){
        cost = 100;
        weight = 10000;
        maxWeight = 18000;
        launchExplosion = 0.0;
        landingCrash = 0.0;
        currentWeight = weight;
    }

    @Override
    public boolean launch() {
        Random rand = new Random();
        int num = rand.nextInt(100);
        num += 1;

            System.out.println("\nStart następnej rakiety U1.");
            //System.out.println("Start " + countRockets + " rakiety U1.");

        this.launchExplosion = 5.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        if (this.launchExplosion >= num){
            System.out.println("Rakieta U1 uległa destrukcji podczas startu rakiety!");
            return false;
        } else {
            System.out.println("Rakieta U1 wystartowała!");
            return true;
        }
    }

    @Override
    public boolean land() {
        Random rand = new Random();
        int num = rand.nextInt(100);
        num += 1;
        System.out.println("Lądowanie rakiety U1.");

        this.landingCrash = 1.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        if (this.launchExplosion >= num){
            System.out.println("Rakieta U1 uległa destrukcji podczas lądowania!");
            return false;
        } else {
            System.out.println("Rakieta U1 wylądowała!");
            return true;
        }

    }

}