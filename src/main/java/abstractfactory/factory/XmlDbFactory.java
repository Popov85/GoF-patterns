package abstractfactory.factory;

import abstractfactory.ClientDao;
import abstractfactory.CurrencyDao;
import abstractfactory.impl.XmlDbClientDaoImpl;
import abstractfactory.impl.XmlDbCurrencyDaoImpl;

/**
 * Created by Andrey on 10/16/2016.
 */
public class XmlDbFactory extends AbstractFactory {

        public ClientDao getClientImpl() {
                return new XmlDbClientDaoImpl();
        }

        public CurrencyDao getCurrencyImpl() {
                return new XmlDbCurrencyDaoImpl();
        }
}
