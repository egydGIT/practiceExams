package qualifyingExam0.army;

public class Swordsman extends MilitaryUnit{

    private boolean hasScutum;

    public Swordsman(boolean hasCorcelet) {
        super(100, 10, hasCorcelet);
        this.hasScutum = true;
    }

    @Override
    public void sufferDamage(int damage) {
        if (hasScutum) {
            hasScutum = false;
        } else {
            super.sufferDamage(damage);
        }
    }
}
