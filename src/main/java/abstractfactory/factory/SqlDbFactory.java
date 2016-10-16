package abstractfactory.factory;

import abstractfactory.ClientDao;
import abstractfactory.CurrencyDao;
import abstractfactory.impl.SqlDbClientDaoImpl;
import abstractfactory.impl.SqlDbCurrencyDaoImpl;

/**
 * Created by Andrey on 10/16/2016.
 */
public class SqlDbFactory extends AbstractFactory {

        public ClientDao getClientImpl() {
                return new SqlDbClientDaoImpl();
        }

        public CurrencyDao getCurrencyImpl() {
                return new SqlDbCurrencyDaoImpl();
        }
}
