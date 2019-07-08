import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //System.out.println("Hello World!");
        Simulation simulation = new Simulation();

        ArrayList<Item> phase1 = simulation.loadItems("phase-1.txt");
        ArrayList<Item> phase2 = simulation.loadItems("phase-2.txt");
        //Phase1
        System.out.println("\nFaza1 U1:");
        ArrayList<Rocket> u1FleetPhase1 = simulation.loadU1(phase1);
        int budgetU1phase1 = simulation.runSimulation(u1FleetPhase1);
        //Phase2
        System.out.println("\nFaza2 U1:");
        ArrayList<Rocket> u1FleetPhase2 = simulation.loadU1(phase2);
        int budgetU1phase2 = simulation.runSimulation(u1FleetPhase2);

//        System.out.println("Podsumowanie rakiet U1:");
//        System.out.println("Koszt wysłania floty U1 Faza1: " + budgetU1phase1 + " mln.");
//        System.out.println("Koszt wysłania floty U1 Faza2: " + budgetU1phase2 + " mln.");
//
//        System.out.println("Suma wyprawy kosmicznej z wykorzystaniem rakiet U1: " + (budgetU1phase1 + budgetU1phase2) + " mln.");

        //Phase1
        System.out.println("\nFaza1 U2:");
        ArrayList<Rocket> u2FleetPhase1 = simulation.loadU2(phase1);
        int budgetU2phase1 = simulation.runSimulation(u2FleetPhase1);
        //Phase2
        System.out.println("\nFaza2 U2:");
        ArrayList<Rocket> u2FleetPhase2 = simulation.loadU2(phase2);
        int budgetU2phase2 = simulation.runSimulation(u2FleetPhase2);

        System.out.println("Podsumowanie rakiet U1:");
        System.out.println("Koszt wysłania floty U1 Faza1: " + budgetU1phase1 + " mln.");
        System.out.println("Koszt wysłania floty U1 Faza2: " + budgetU1phase2 + " mln.");

        System.out.println("Suma wyprawy kosmicznej z wykorzystaniem rakiet U1: " + (budgetU1phase1 + budgetU1phase2) + " mln.");

        System.out.println("Podsumowanie rakiet U2:");
        System.out.println("Koszt wysłania floty U2 Faza1: " + budgetU2phase1 + " mln.");
        System.out.println("Koszt wysłania floty U2 Faza2: " + budgetU2phase2 + " mln.");

        System.out.println("Suma wyprawy kosmicznej z wykorzystaniem rakiet U2: " + (budgetU2phase1 + budgetU2phase2) + " mln.");

    }
}


