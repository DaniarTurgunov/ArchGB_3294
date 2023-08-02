import java.util.ArrayList;
import java.util.List;

import Classes.ItemGenerator;
import Classes.Rewards.ArmorFabric;
import Classes.Rewards.BowFabric;
import Classes.Rewards.GemFabric;
import Classes.Rewards.GoldFabric;
import Classes.Rewards.HealFabric;
import Classes.Rewards.KnifeFabric;
import Classes.Rewards.SwordFabric;

public class App {
    public static void main(String[] args) throws Exception {
        ItemGenerator fab1 = new GoldFabric();
        ItemGenerator fab2 = new GemFabric();
        ItemGenerator fab3 = new SwordFabric();
        ItemGenerator fab4 = new KnifeFabric();
        ItemGenerator fab5 = new BowFabric();
        ItemGenerator fab6 = new ArmorFabric();
        ItemGenerator fab7 = new HealFabric();

        List<ItemGenerator> fabList = new ArrayList<>();
        fabList.add(fab1);
        fabList.add(fab2);
        fabList.add(fab3);
        fabList.add(fab4);
        fabList.add(fab5);
        fabList.add(fab6);
        fabList.add(fab7);

        for (int i = 0; i < 20; i++) {
            int index = (int) (Math.random() * fabList.size());
            fabList.get(index).openReward();
        }

    }
}
