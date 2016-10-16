package decorator;

/**
 * Created by Andrey on 10/16/2016.
 */
public class App {
        public static void main(String[] args) {
                Car car = new Weapon(new Armour(new Flasher(new Mercedes())));
                car.go();
        }
}
