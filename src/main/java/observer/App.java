package observer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Andrey on 10/16/2016.
 */
public class App {
        public static void main(String[] args) {
                ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
                Airport airport = (Airport) context.getBean("airport");

                Observer panel = (Panel) context.getBean("panel");
                panel.subscribe();
                Observer webSite1 = (Web) context.getBean("web");
                webSite1.subscribe();
                Observer webSite2 = (Web) context.getBean("web");
                webSite2.subscribe();
                Observer smsPerson = (Sms) context.getBean("sms");
                smsPerson.subscribe();
                Observer smsPerson2 = (Sms) context.getBean("sms");
                smsPerson2.subscribe();
                Observer smsPerson3 = (Sms) context.getBean("sms");
                smsPerson3.subscribe();

                String flight1 = new String("767");
                String flight2 = new String("768");
                String flight3 = new String("769");
                airport.addFlight(flight1);
                airport.addFlight(flight2);
                airport.addFlight(flight3);

                airport.removeFlight(flight1);
        }
}
