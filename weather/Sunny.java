package weather;

public class Sunny extends Weather {
    private int lowLevel = 10;
    private int highLevel = 40;
    private String type = "Sunny";
    
    public Sunny() {
        super();
        super.SetWindLevel(randNum.nextInt(highLevel) + lowLevel);
        super.SetWeatherType(type);
    } // Sunny()

    public String GetType() {
        return this.type;
    } // GetType()
    
} // class