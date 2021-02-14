package weather;

public class Rainy extends Weather {
    private int lowLevel = 40;
    private int highLevel = 60;
    private String type = "Rainy";
    
    public Rainy() {
        super();
        super.SetWindLevel(randNum.nextInt(highLevel) + lowLevel);
        super.SetWeatherType(type);
    } // Rainy()

    public String GetType() {
        return this.type;
    } // GetType()
    
} // class