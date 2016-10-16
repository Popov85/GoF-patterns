package decorator;

/**
 * Created by Andrey on 10/16/2016.
 */
public class Armour extends CarDecorator {
        public Armour(Car decoratedCar) {
                super(decoratedCar);
        }

        @Override
        public void go() {
                super.go();
                System.out.println("Armour slows down the car ...");
        }
}
