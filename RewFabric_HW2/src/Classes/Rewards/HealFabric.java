package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class HealFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Heal();
    }

}
