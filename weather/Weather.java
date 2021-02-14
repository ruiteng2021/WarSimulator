package weather;
import java.util.Random;

public abstract class Weather {

    private int windLevel;
    private String type;
    protected Random randNum = new Random();

    public Weather (){}

     // getters
    public int GetwindLevel() {
        return this.windLevel;
    }// GetwindLevel()
    
    public String GetWeatherType() {
        return type;
    } // GetWeatherType() 

     // setters
    public void SetWindLevel(int level) {
        this.windLevel = level;
    } // SetWindLevel

    public void SetWeatherType(String type) {
        this.type = type;
    } // SetWeatherType

} // class