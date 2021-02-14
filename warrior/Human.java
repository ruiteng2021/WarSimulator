package warrior;

public  class Human extends Warrior {
    private int lowHealth = 50;
    private int highHealth = 100;
    private int lowDexterity = 50;
    private int highDexterity = 70;
    private int lowStrength = 100;
    private int highStrength = 150;
    private String type = "Human";
    
    public Human() {
        super();
        super.SetHealth(randNum.nextInt(highHealth) + lowHealth);
        super.SetDexterity(randNum.nextInt(highDexterity) + lowDexterity);
        super.SetStrength(randNum.nextInt(highStrength) + lowStrength);
        super.SetWarriorType(type);
    } // Human()

    public String GetType() {
        return this.type;
    } // GetType()
    
} // class