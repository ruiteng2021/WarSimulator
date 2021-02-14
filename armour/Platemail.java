package armour;

public class Platemail extends Armour {

    private int pointLow = 120;
    private int pointHigh = 190;
    private int dexLow = 10;
    private int dexHigh = 15;
    private String type = "Platemail";

    public Platemail() {
        super();
        super.SetArmourPoints(super.randNum.nextInt(pointHigh) + pointLow);
        super.SetDexCost(super.randNum.nextInt(dexHigh) + dexLow);
        super.SetArmourType(type);
    } // Platemail()

    public String GetType() {
        return this.type;
    } // GetType()
    
} // class