package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class ArmorFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Armor();
    }

}
