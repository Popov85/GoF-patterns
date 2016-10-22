package strategy;

import java.util.List;

/**
 * Created by Andrey on 10/22/2016.
 */
public class WeatherStrategy {
        private IWearingStrategy strategy;
        private List<String> accessories;
        private List<String> clothes;

        public WeatherStrategy(IWearingStrategy strategy) {
                this.strategy = strategy;
        }

        public List<String> getAccessories() {
                return strategy.getAccessories();
        }

        public List<String> getClothes() {
                return strategy.getClothes();
        }
}
