package warrior;

public class Cleric extends Warrior {
    private int lowHealth = 250;
    private int highHealth = 300;
    private int lowDexterity = 70;
    private int highDexterity = 130;
    private int lowStrength = 10;
    private int highStrength = 40;
    private String type = "Cleric";
    
    public Cleric() {
        super();
        super.SetHealth(randNum.nextInt(highHealth) + lowHealth);
        super.SetDexterity(randNum.nextInt(highDexterity) + lowDexterity);
        super.SetStrength(randNum.nextInt(highStrength) + lowStrength);
        super.SetWarriorType(type);
    } // Cleric()

    public String GetType() {
        return this.type;
    } // GetType()
    
} // class