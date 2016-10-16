package abstractfactory.impl;

import abstractfactory.ClientDao;

/**
 * Created by Andrey on 10/16/2016.
 */
public class SqlDbClientDaoImpl implements ClientDao {
        @Override
        public void create() {

        }

        @Override
        public void read() {
                System.out.println("SqlDbClientDaoImpl reading... ");
        }

        @Override
        public void update() {

        }

        @Override
        public void delete() {

        }
}
