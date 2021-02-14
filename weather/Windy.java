package weather;

public class Windy extends Weather {
    private int lowLevel = 60;
    private int highLevel = 80;
    private String type = "Windy";
    
    public Windy() {
        super();
        super.SetWindLevel(randNum.nextInt(highLevel) + lowLevel);
        super.SetWeatherType(type);
    } // Windy()

    public String GetType() {
        return this.type;
    } // GetType()
    
} // class