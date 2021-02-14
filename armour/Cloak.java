package armour;

public class Cloak extends Armour {

    private int pointLow = 250;
    private int pointHigh = 300;
    private int dexLow = 0;
    private int dexHigh = 3;
    private String type = "Cloak";

    public Cloak() {
        super();
        super.SetArmourPoints(super.randNum.nextInt(pointHigh) + pointLow);
        super.SetDexCost(super.randNum.nextInt(dexHigh) + dexLow);
        super.SetArmourType(type);
    } // Cloak()

    public String GetType() {
        return this.type;
    } // GetType()
    
} // class