package units.protoss;

import units.Unit;

public class ProtossUnit extends Unit {
    private int shield;

    public ProtossUnit(int hp, int shield, int strength) {
        super(hp, strength);
        this.shield = shield;
    }

    public int getShield() {
        return shield;
    }

    @Override
    public void getDamaged(int damage) {
        while (damage > 0 && shield > 0) {
            damage--;
            shield--;
        }
        super.getDamaged(damage);
    }

    @Override
    public String getStatus() {
        return "HP : " + getHP() + ", Shield : " + getShield();
    }
}
