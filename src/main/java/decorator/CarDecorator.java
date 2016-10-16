package decorator;

/**
 * Created by Andrey on 10/16/2016.
 */
public abstract class CarDecorator implements Car {

        protected Car decoratedCar;

        public CarDecorator(Car decoratedCar) {
                this.decoratedCar = decoratedCar;
        }

        @Override
        public void go() {
                decoratedCar.go();
        }
}
