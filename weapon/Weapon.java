package weapon;
import java.util.Random;

public abstract class Weapon {

    private int weaponDamage;
    private int hitProbability;
    private String type;
    protected Random randNum = new Random();

    public Weapon (){}

    public int GetWeaponDamage() {
        return this.weaponDamage;
    } // GetWeaponDamage
    
    public void SetWeaponDamage(int damage) {
        this.weaponDamage = damage;
    } // SetWeaponDamage

    public void SetWeaponType(String type) {
        this.type = type;
    } // SetWeaponType

    public void SetHitProbability(int hitProbability) {
        this.hitProbability = hitProbability;
    } // SetHitProbability    

    public String GetWeaponType() {
        return type;
    } // GetWeaponType()

    public int GetHitProbability() {
        return hitProbability;
    } // GetHitProbability()

    // poloymorphic method
    public abstract int Strike(int dex, int strength, int windLevel);

} // class