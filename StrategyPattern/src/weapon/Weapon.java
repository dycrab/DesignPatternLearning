package weapon;

import behavior.Attack;
import behavior.Reload;

public class Weapon {

    Attack attack;
    Reload reload;

    Weapon() {

    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }

    public void setReload(Reload reload) {
        this.reload = reload;
    }

    public void attack() {
        attack.attack();
    }

    public void reload(){
        reload.reload();
    }
}
