package Classes.Rewards;

import Classes.iGameItem;

public class Heal implements iGameItem {

    @Override
    public void open() {
        System.out.println("HP!");
    }

}
