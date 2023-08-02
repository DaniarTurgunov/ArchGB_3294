package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class KnifeFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Knife();
    }

}
