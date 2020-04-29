package units.terran;

import units.Unit;

public class Medic extends Unit {

    public Medic() {
        super(20, 0);
    }

    public void heal(Unit unit) {
        int heal = 1;
        unit.setHp(unit.getHP() + heal);
        System.out.println(unit.getUnitName() + "을 회복한 HP :" + unit.getHP());
    }


}

