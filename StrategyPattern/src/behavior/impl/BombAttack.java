package behavior.impl;

import behavior.Attack;

public class BombAttack implements Attack {

    @Override
    public void attack() {
        System.out.println("I will explode to attack!");
    }
}
