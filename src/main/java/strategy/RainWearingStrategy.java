package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 10/22/2016.
 */
public class RainWearingStrategy implements IWearingStrategy {
        @Override
        public List<String> getAccessories() {
                List<String> accessories = new ArrayList<>();
                accessories.add("Umbrella");
                return accessories;
        }

        @Override
        public List<String> getClothes() {
                List<String> clothes = new ArrayList<>();
                clothes.add("Coat");
                clothes.add("gumboots");
                return clothes;
        }
}
