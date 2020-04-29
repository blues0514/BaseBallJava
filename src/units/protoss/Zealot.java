package units.protoss;

import etc.Fastable;

public class Zealot extends ProtossUnit implements Fastable {
    public Zealot() {
        super(100, 5, 10);
    }

    public void balup() {
        speed += 3;
    }

    @Override
    public void speedUp() {
        balup();
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String getUnitName() {
        return "Zealot";
    }
}
