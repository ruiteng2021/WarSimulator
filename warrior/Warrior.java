package warrior;
import java.util.Random;

public abstract class Warrior {
    protected Random randNum = new Random();
    private int health;
    private int dexterity;
    private int strength;
    private String type;

    public Warrior() {}

    public int TakeDamage(int amount) {
        return this.health -= amount;
    } // Warrior()

    // getters
    public int GetHealth(){
        return this.health;
    } // GetHealth()

    public int GetDexterity(){
        return this.dexterity;
    } // GetDexterity()

    public int GetStrength(){
        return this.strength;
    } // GetStrength()

    public String GetWarriorType() {
        return type;
    } // GetWarriorType()
    
    // setters
    public void SetHealth(int health){
        this.health = health;
    } // SetHealth

    public void SetDexterity(int dexterity){
        this.dexterity = dexterity;
    } // SetDexterity

    public void SetStrength(int strength){
        this.strength = strength;
    } // SetStrength

    public void SetWarriorType(String type) {
        this.type = type;
    } // SetWarriorType
    
} // class