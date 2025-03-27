package behavior.impl;

import behavior.Reload;

public class GunReload implements Reload {
    @Override
    public void reload() {
        System.out.println("Reload if have bullet.");
    }
}
