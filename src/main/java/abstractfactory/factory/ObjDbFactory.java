package abstractfactory.factory;

import abstractfactory.ClientDao;
import abstractfactory.CurrencyDao;
import abstractfactory.impl.ObjDbClientDaoImpl;
import abstractfactory.impl.ObjDbCurrencyDaoImpl;

/**
 * Created by Andrey on 10/16/2016.
 */
public class ObjDbFactory extends AbstractFactory {
        @Override
        public ClientDao getClientImpl() {
                return new ObjDbClientDaoImpl();
        }

        @Override
        public CurrencyDao getCurrencyImpl() {
                return new ObjDbCurrencyDaoImpl();
        }
}
