package behavior.impl;

import behavior.Attack;

public class ThrowAttack implements Attack {
    @Override
    public void attack() {
        System.out.println("I only throw at someone to cause attack!");
    }
}
