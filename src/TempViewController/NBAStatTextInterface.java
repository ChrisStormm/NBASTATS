package TempViewController;

import statModel.StatGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NBAStatTextInterface {
    public static void main(String[] args){
        List<Double> enteredStats = new ArrayList<Double>();
        Scanner console = new Scanner(System.in);
        System.out.println("Points: ");
        enteredStats.add(console.nextDouble());
        System.out.println("Offensive boards ");
        enteredStats.add(console.nextDouble());
        System.out.println("Total Boards: ");
        enteredStats.add(console.nextDouble());
        System.out.println("Assist: ");
        enteredStats.add(console.nextDouble());
        System.out.println("FG%: ");
        enteredStats.add(console.nextDouble());
        System.out.println("Freethrow attempts: ");
        enteredStats.add(console.nextDouble());
        System.out.println("3PM: ");
        enteredStats.add(console.nextDouble());
        System.out.println("3P%: ");
        enteredStats.add(console.nextDouble());
        System.out.println("blocks: ");
        enteredStats.add(console.nextDouble());
        System.out.println("steals: ");
        enteredStats.add(console.nextDouble());
        StatGenerator model = new StatGenerator(enteredStats);
        System.out.println("PLayer Defensive Score" + model.defensivePlayerImpactScore());
        System.out.println("PLayer Offensive Score" + model.offensivePlayerImpactScore());
        System.out.println("PLayer total Score" + model.playerImpactScore());
    }
}
