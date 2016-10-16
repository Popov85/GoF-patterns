package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 10/16/2016.
 */
public class Airport {

        private List<Observer> observers = new ArrayList<>();

        private List<String> flight = new ArrayList<>();

        public void add(Observer observer) {
              observers.add(observer);
        }

        public void remove(Observer observer) {
                observers.remove(observer);
        }

        public List<String> getFlight() {
                return flight;
        }

        public void addFlight(String flight) {
                this.flight.add(flight);
                notifyObservers();
        }

        public void removeFlight(String flight) {
                this.flight.remove(flight);
                notifyObservers();
        }

        public void notifyObservers() {
                for (Observer observer : observers) {
                        observer.update();
                }
        }
}
