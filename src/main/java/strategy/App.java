package strategy;

import java.util.List;

/**
 * Created by Andrey on 10/22/2016.
 */
public class App {
        public static void main(String[] args) {
                IWearingStrategy strategy = new SunShineWearingStrategy();
                WeatherStrategy weatherStrategy = new WeatherStrategy(strategy);
                List<String> accessories = weatherStrategy.getAccessories();
                System.out.println("Accessories are:");
                for (String accessory : accessories) {
                        System.out.println(accessory);
                }
                List<String> clothes = weatherStrategy.getClothes();
                System.out.println("Clothes are:");
                for (String clothesPiece : clothes) {
                        System.out.println(clothesPiece);
                }
        }
}
