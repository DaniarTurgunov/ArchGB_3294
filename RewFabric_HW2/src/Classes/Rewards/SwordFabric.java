package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class SwordFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Sword();
    }

}
