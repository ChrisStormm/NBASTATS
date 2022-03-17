package statModel;

import java.util.Map;

//When given an NBA Players relevant stats is capable of generating Player Offensive Impact score(POIS),
//Player Defense Impact Score(PDIS), and Player Impact Score (PIS)
public class StatGenerator {

    public StatGenerator(Map<String, Double> playerStats){

    }

    public double playerImpactScore(){
       throw new RuntimeException("method not implemented");
    }

    public double offensivePlayerImpactScore(){
        throw new RuntimeException("method not implemented");
    }

    public double defensivePlayerImpactScore(){
        throw new RuntimeException("method not implemented");
    }

}
