package weapon;

import behavior.Attack;
import behavior.Reload;
import behavior.impl.MolotovAttack;
import behavior.impl.ThrowingObjectReload;

public class MolotovBomb extends Weapon{

    public MolotovBomb(Attack attack, Reload reload) {
        this.setAttack(attack);
        this.setReload(reload);
    }
}
