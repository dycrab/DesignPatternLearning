package behavior.impl;

import behavior.Attack;

public class MolotovAttack implements Attack {
    @Override
    public void attack() {
        System.out.println("I will burning attack! ");
    }
}
