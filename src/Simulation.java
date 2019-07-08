import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Simulation {

    int runSimulation(ArrayList<Rocket> list) {
        int fails = 0;
        for (Rocket r : list) {

            for (int i = list.size(); i >= list.size();i--){
                if (!r.launch()){
                    r.launch();
                    if (!r.land()) fails++;
                    fails++;
                } else {
                    if (!r.land()){
                        fails++;
                    }
                }
            }
        }
        System.out.println("\nRakiet planowanych: " + list.size() + "; Dodatkowe rakiety: " + fails + "; Suma wystrzelonych rakiet: " + (list.size() + fails) + ";\n");
        int budget = list.get(0).cost * (list.size() + fails);
        return budget;
    }

    ArrayList<Item> loadItems(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scan = new Scanner(file);
        ArrayList<Item> items = new ArrayList<>();

        while(scan.hasNextLine()){
            String line = scan.nextLine();
            String[] oneItem = line.split("=");
            items.add(new Item(oneItem[0], Integer.valueOf(oneItem[1])));
        }
        return items;
    }

    ArrayList<Rocket> loadU1(ArrayList<Item> list) {
        ArrayList<Rocket> fleet = new ArrayList<>();
        Rocket r = new U1();

        System.out.println("\nRakieta U1 waży = " + r.weight + "kg; ładowność = " + r.maxWeight + "kg; koszt rakiety: " + r.cost + " mln;");

        for (Item i : list) {

            for (int j = list.size(); j >= list.size();j--){
                if (!r.canCarry(i)){
                    fleet.add(r);
                    r = new U1();
                }
                r.carry(i);
            }
        }
        fleet.add(r);
        System.out.println("Flota U1 potrzebuje rakiet: " + fleet.size());
        return fleet;
    }

    ArrayList<Rocket> loadU2(ArrayList<Item> list) {
        ArrayList<Rocket> fleet = new ArrayList<>();
        Rocket r = new U2();

        System.out.println("\nRakieta U2 waży = " + r.weight + "kg; ładowność = " + r.maxWeight + "kg; koszt rakiety: " + r.cost + " mln;");

        for (Item i : list) {

            for (int j = list.size(); j >= list.size();j--){
                if (!r.canCarry(i)){
                    fleet.add(r);
                    r = new U2();
                }
                r.carry(i);
            }
        }
        fleet.add(r);
        System.out.println("Flota U2 potrzebuje rakiet: " + fleet.size());
        return fleet;
    }

}