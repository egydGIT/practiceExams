package qualifyingExam0.army;

public class HeavyCavalry extends MilitaryUnit{

    boolean firstAttack;

    public HeavyCavalry() {
        super(150, 20, true);
        firstAttack = true;
    }

    @Override
    public int doDamage() {
        int damage = getDamage();
        if (firstAttack) {
            damage *= 3;
            firstAttack = false;
        }
        return damage;
    }

}
