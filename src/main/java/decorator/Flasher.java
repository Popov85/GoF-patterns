package decorator;

/**
 * Created by Andrey on 10/16/2016.
 */
public class Flasher extends CarDecorator {

        public Flasher(Car decoratedCar) {
                super(decoratedCar);
        }

        @Override
        public void go() {
                super.go();
                System.out.println("Flasher speeds up the car..");
        }
}
