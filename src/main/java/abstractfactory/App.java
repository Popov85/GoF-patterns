package abstractfactory;

import abstractfactory.factory.AbstractFactory;
import abstractfactory.impl.SqlDbClientDaoImpl;

/**
 * Created by Andrey on 10/16/2016.
 */
public class App {
        public static void main(String[] args) {
                AbstractFactory factory = AbstractFactory.getFactory("Sql");
                ClientDao clientImpl = factory.getClientImpl();
                clientImpl.read();
                CurrencyDao currImpl = factory.getCurrencyImpl();
                currImpl.read();
        }
}
