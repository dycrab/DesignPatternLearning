package weapon;

import behavior.impl.ThrowAttack;
import behavior.impl.ThrowingObjectReload;

public class SmokingBomb extends Weapon{
    public SmokingBomb(ThrowAttack attack, ThrowingObjectReload reload) {
        this.setAttack(attack);
        this.setReload(reload);
    }
}
