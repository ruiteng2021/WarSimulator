package weapon;

public class Longbows extends Weapon {
    private int damage = 120;
    private String type = "Longbows";
    private int hitProbability = 95;

    public Longbows() {
        super();
        super.SetWeaponDamage(damage);
        super.SetWeaponType(type);
        super.SetHitProbability(hitProbability);
    } // Longbows()

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