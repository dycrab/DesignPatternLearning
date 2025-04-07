import projects.BoHaiBank;
import workers.Work1;

/**
 * 功能描述
 *
 * @author z30072591
 * @since 2025-03-28
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BoHaiBank boHaiBank = new BoHaiBank();

        Work1 work1 = new Work1(boHaiBank);

        boHaiBank.changeWorkState("前端",true);
        boHaiBank.notifyWorkers();

    }
}