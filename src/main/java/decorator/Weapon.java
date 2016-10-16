package decorator;

/**
 * Created by Andrey on 10/16/2016.
 */
public class Weapon extends CarDecorator {
        public Weapon(Car decoratedCar) {
                super(decoratedCar);
        }

        @Override
        public void go() {
                super.go();
                System.out.println("The car can now shot...");
        }
}
