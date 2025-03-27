package behavior.impl;

import behavior.Attack;

public class GunAttack implements Attack {

    @Override
    public void attack() {
        System.out.println("I will shoot bullet to attack!");
    }
}
