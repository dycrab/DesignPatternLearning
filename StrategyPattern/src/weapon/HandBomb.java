package weapon;

import behavior.Attack;
import behavior.Reload;
import behavior.impl.BombAttack;
import behavior.impl.ThrowingObjectReload;

public class HandBomb extends Weapon{
    public HandBomb(Attack attack, Reload reload) {
        this.setAttack(attack);
        this.setReload(reload);
    }
}
