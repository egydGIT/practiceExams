package qualifyingExam0.army;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Army {

    private List<MilitaryUnit> militaryUnits = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        militaryUnits.add(militaryUnit);
    }

    public void damageAll(int damage) {
        Iterator<MilitaryUnit> iterator = militaryUnits.iterator();
        while (iterator.hasNext()) {
            MilitaryUnit actual = iterator.next();
            actual.sufferDamage(damage);
            if (actual.getHitPoints() < 25) {
                iterator.remove();
            }
        }
    }

    public int getArmyDamage() {
        int counter = 0;
        for (MilitaryUnit unit : militaryUnits) {
            counter += unit.doDamage();
        }
        return counter;
    }

    public int getArmySize() {
        return militaryUnits.size();
    }

    public List<MilitaryUnit> getMilitaryUnits() {
        return militaryUnits;
    }
}
