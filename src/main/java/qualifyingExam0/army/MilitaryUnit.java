package qualifyingExam0.army;

public abstract class MilitaryUnit {

    private int hitPoints;
    private int damage;
    private boolean corselet;

    public MilitaryUnit(int hitPoints, int damage, boolean corselet) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.corselet = corselet;
    }

    public int doDamage() {
        return damage;
    }

    public void sufferDamage(int damage) {
        if (corselet) {
            hitPoints -= (damage / 2);
        }
        else {
            hitPoints -= damage;
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public boolean hasCorselet() {
        return corselet;
    }

}
