package abstractfactory.factory;

import abstractfactory.ClientDao;
import abstractfactory.CurrencyDao;

/**
 * Created by Andrey on 10/16/2016.
 */
public abstract class AbstractFactory {
        public static AbstractFactory getFactory(String factoryName) {
                switch (factoryName) {
                        case "Obj":
                                return new ObjDbFactory();
                        case "Sql":
                                return new SqlDbFactory();
                        default:
                                return new XmlDbFactory();
                }
        }
        public abstract ClientDao getClientImpl();

        public abstract CurrencyDao getCurrencyImpl();
}
