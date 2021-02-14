package weather;

public class Storm extends Weather {
    private int lowLevel = 80;
    private int highLevel = 100;
    private String type = "Storm";
    
    public Storm() {
        super();
        super.SetWindLevel(randNum.nextInt(highLevel) + lowLevel);
        super.SetWeatherType(type);
    } // Storm()

    public String GetType() {
        return this.type;
    } // GetType()
    
} // class