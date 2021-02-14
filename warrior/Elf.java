package warrior;

public class Elf extends Warrior {
    private int lowHealth = 30;
    private int highHealth = 70;
    private int lowDexterity = 70;
    private int highDexterity = 130;
    private int lowStrength = 50;
    private int highStrength = 100;
    private String type = "Elf";
    
    public Elf() {
        super();
        super.SetHealth(randNum.nextInt(highHealth) + lowHealth);
        super.SetDexterity(randNum.nextInt(highDexterity) + lowDexterity);
        super.SetStrength(randNum.nextInt(highStrength) + lowStrength);
        super.SetWarriorType(type);
    } // Elf()

    public String GetType() {
        return this.type;
    } // GetType()
    
} // class