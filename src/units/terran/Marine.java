package units.terran;

import etc.Fastable;
import units.Unit;

public class Marine extends Unit implements Fastable{
    public Marine() {
        super(5, 10);
    }

    void useSteamPack(){
        speed *= 2;
    }

    @Override
    public void speedUp() {
        useSteamPack();
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String getUnitName() {
        return "Marin";
    }

}
