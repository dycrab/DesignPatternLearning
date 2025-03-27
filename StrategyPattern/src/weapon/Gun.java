package weapon;

import behavior.Attack;
import behavior.Reload;
import behavior.impl.GunAttack;
import behavior.impl.GunReload;

/**
 * 我们的枪的行为
 */
public class Gun extends Weapon {

    public Gun(Attack attack, Reload reload) {
        this.setAttack(attack);
        this.setReload(reload);
    }
}
