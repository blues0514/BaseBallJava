package units;

public abstract class Unit {
    protected int speed;
    protected int strength;
    private int hp;

    public Unit(int hp, int strength) {
        this.hp = hp;
        this.strength = strength;
        speed = 3;
    }

    public void getDamaged(int damage) {
        while (damage > 0 && hp > 0) {
            damage--;
            hp--;
        }
    }

    void upgradeStrength() {
        strength += 2;
    }

    public void strengthUp() {
        upgradeStrength();
    }

    public int getStrength() {
        return strength;
    }

    public int getHP() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getUnitName() {
        return "John Doe";
    }

    public String getStatus() {
        return getUnitName() + " HP: " + getHP() + "회복량 : " + "공격력 : " + getStrength();
    }

}
