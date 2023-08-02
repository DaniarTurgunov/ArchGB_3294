package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class BowFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Bow();
    }

}
