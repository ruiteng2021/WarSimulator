package armour;

import java.util.Random;

public class Armour {
    protected Random randNum = new Random();
    private int armourPoints;
    private int dexCost;
    private String type;

    public Armour() { }
    // getters
    public int GetArmourPoints() {
        return this.armourPoints;
    } // GetArmourPoints()

    public int GetDexCost() {
        return this.dexCost;
    } // GetDexCost()

    public String GetArmourType() {
        return type;
    } // GetArmourType()

    // setters
    public void SetArmourPoints(int points) {
        this.armourPoints = points;
    } // SetArmourPoints

    public void SetDexCost(int cost) {
        this.dexCost = cost;
    } // SetDexCost

    public void SetArmourType(String type) {
        this.type = type;
    } // SetArmourType
    
} // class