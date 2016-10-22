package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 10/22/2016.
 */
public class SunShineWearingStrategy implements IWearingStrategy {
        @Override
        public List<String> getAccessories() {
                List<String> accessories = new ArrayList<>();
                accessories.add("Sunglasses");
                return accessories;
        }

        @Override
        public List<String> getClothes() {
                List<String> clothes = new ArrayList<>();
                clothes.add("T-short");
                clothes.add("short");
                return clothes;
        }
}
