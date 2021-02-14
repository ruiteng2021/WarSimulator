package warrior;

public class Orc extends Warrior {
    private int lowHealth = 70;
    private int highHealth = 170;
    private int lowDexterity = 30;
    private int highDexterity = 50;
    private int lowStrength = 120;
    private int highStrength = 180;
    private String type = "Orc";
    
    public Orc() {
        super();
        super.SetHealth(randNum.nextInt(highHealth) + lowHealth);
        super.SetDexterity(randNum.nextInt(highDexterity) + lowDexterity);
        super.SetStrength(randNum.nextInt(highStrength) + lowStrength);
        super.SetWarriorType(type);
    } // Orc()

    public String GetType() {
        return this.type;
    } // GetType() 
    
} // class