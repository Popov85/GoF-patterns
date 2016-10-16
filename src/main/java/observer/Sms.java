package observer;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Andrey on 10/16/2016.
 */
public class Sms implements Observer {

        @Autowired
        Airport airport;

        public void setAirport(Airport airport) {
                this.airport = airport;
        }

        @Override
        public void update() {
                System.out.println("Updated info on SMS of user: "+this.getClass()+" is: "+airport.getFlight());
        }

        public void subscribe() {
                airport.add(this);
        }

        public void unsubscribe() {
                airport.remove(this);
        }
}
