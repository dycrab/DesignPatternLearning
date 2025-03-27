package weapon;

import behavior.Attack;
import behavior.Reload;
import behavior.impl.ThrowAttack;
import behavior.impl.ThrowingObjectReload;

public class FlashingBomb extends Weapon{
    public FlashingBomb(Attack attack, Reload reload) {
        this.setAttack(attack);
        this.setReload(reload);
    }
}
