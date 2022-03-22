package statModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//When given an NBA Players relevant stats is capable of generating Player Offensive Impact score(POIS),
//Player Defense Impact Score(PDIS), and Player Impact Score (PIS)
public class StatGenerator {
    private final Map<String, Double> stats;
    //List in format [points, Offensive rebounds, total rebounds, assists, fg%, ft attempt, 3PM made, 3PT percent, blocks, steals]
    public StatGenerator(List<Double> playerStats){
        stats = new HashMap<>();
        if(playerStats.size() != 10){
            throw new IllegalArgumentException("list size must be 10");
        }
        stats.put("Points", playerStats.get(0));
        stats.put("OffensiveRebounds", playerStats.get(1));
        stats.put("Rebounds", playerStats.get(2));
        stats.put("Assists", playerStats.get(3));
        stats.put("FG%", playerStats.get(4));
        stats.put("FTA", playerStats.get(5));
        stats.put("3PM", playerStats.get(6));
        stats.put("3P%", playerStats.get(7));
        stats.put("blocks", playerStats.get(8));
        stats.put("steals", playerStats.get(9));
    }

    public double playerImpactScore(){
       throw new RuntimeException("method not implemented");
    }

    public double offensivePlayerImpactScore(){
        double result = 0.0;
        result += stats.get("points")*stats.get("FG%");
        result += 0.7 * stats.get("OffensiveRebounds");
        result += 0.7 * stats.get("Assists");
        result+= stats.get("3PM") * (stats.get("3P%") - 30);
        if(stats.get("FTA") > 10.0){
            result -= stats.get("FTA") - 10;
        }
        return result;
    }

    public double defensivePlayerImpactScore(){
        double result = 0.0;
        result += 3*stats.get("blocks");
        result += 1.5*stats.get("steals");
        //only defensive rebounds
        result += 0.5*(stats.get("Rebounds") - stats.get("OffensiveRebounds"));
        return result;
    }

}
