package armour;

public class Chainmail extends Armour {

    private int pointLow = 70;
    private int pointHigh = 100;
    private int dexLow = 8;
    private int dexHigh = 10;
    private String type = "Chainmail";

    public Chainmail() {
        super();
        super.SetArmourPoints(super.randNum.nextInt(pointHigh) + pointLow);
        super.SetDexCost(super.randNum.nextInt(dexHigh) + dexLow);
        super.SetArmourType(type);
    } // Chainmail()

    public String GetType() {
        return this.type;
    } // GetType()
    
} // class