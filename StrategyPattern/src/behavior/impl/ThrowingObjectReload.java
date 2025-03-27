package behavior.impl;

import behavior.Reload;

public class ThrowingObjectReload implements Reload {
    @Override
    public void reload() {
        System.out.println("I only reload on the start of the game by buying me.");
    }
}
