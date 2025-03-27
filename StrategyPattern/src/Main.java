import behavior.impl.*;
import weapon.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun(new GunAttack(), new GunReload());
        FlashingBomb flashingBomb = new FlashingBomb(new ThrowAttack(),new ThrowingObjectReload());
        SmokingBomb smokingBomb = new SmokingBomb(new ThrowAttack(),new ThrowingObjectReload());
        MolotovBomb molotovBomb = new MolotovBomb(new MolotovAttack(),new ThrowingObjectReload());
        HandBomb handBomb = new HandBomb(new BombAttack(),new ThrowingObjectReload());

        System.out.println("############################################### Attack ###############################################");

        System.out.print("Gun Attack:");
        gun.attack();
        System.out.print("FlashingBomb Attack:");
        flashingBomb.attack();
        System.out.print("SmokingBomb Attack:");
        smokingBomb.attack();
        System.out.print("MolotovBomb Attack:");
        molotovBomb.attack();
        System.out.print("HandBomb Attack:");
        handBomb.attack();

        System.out.println("############################################### Reload ###############################################");

        System.out.print("Gun Reload:");
        gun.reload();
        System.out.print("FlashingBomb Reload:");
        flashingBomb.reload();
        System.out.print("SmokingBomb Reload:");
        smokingBomb.reload();
        System.out.print("MolotovBomb Reload:");
        molotovBomb.reload();
        System.out.print("HandBomb Reload:");
        handBomb.reload();
    }
}