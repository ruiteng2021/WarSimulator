package armour;

public class Leather extends Armour {

    private int pointLow = 30;
    private int pointHigh = 60;
    private int dexLow = 5;
    private int dexHigh = 7;
    private String type = "Leather";

    public Leather() {
        super();
        super.SetArmourPoints(super.randNum.nextInt(pointHigh) + pointLow);
        super.SetDexCost(super.randNum.nextInt(dexHigh) + dexLow);
        super.SetArmourType(type);
    } // Leather()

    public String GetType() {
        return this.type;
    } // GetType()
    
} // class