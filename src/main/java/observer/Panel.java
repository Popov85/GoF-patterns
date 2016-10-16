package observer;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Andrey on 10/16/2016.
 */
public class Panel implements Observer {

        @Autowired
        Airport airport;

        public void setAirport(Airport airport) {
                this.airport = airport;
        }

        @Override
        public void update() {
                System.out.println("Updated info on the PANEL: "+airport.getFlight());
        }

        public void subscribe() {
                airport.add(this);
        }

        public void unsubscribe() {
                airport.remove(this);
        }
}
