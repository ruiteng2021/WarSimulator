package weapon;

public class Axe extends Weapon {
    private int damage = 150;
    private String type = "Axe";
    private int hitProbability = 40;

    public Axe() {
        super();
        super.SetWeaponDamage(damage);
        super.SetWeaponType(type);
        super.SetHitProbability(hitProbability);
    } // Axe()

    public String GetType() {
        return this.type;
    } // GetType()

    @Override
    public int Strike(int dex, int strength, int windLevel) {
        int damage = 0;
        // if the stat hitProb (likelyhood of a hit)
        // is higher than or equal to the rolled num
        // the player successfully has hit!
        dex -= windLevel/10;
        if(randNum.nextInt(100) + 1 
            <= (hitProbability += (dex / 10)))
        {
            damage += strength / 10;
        }
        super.SetHitProbability(hitProbability);
        return damage;
    } // Strike
    
} // class