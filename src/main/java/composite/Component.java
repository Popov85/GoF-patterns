package composite;

import java.math.BigDecimal;

/**
 * Created by Andrey on 10/16/2016.
 */
public abstract class Component {

        protected boolean isLeaf;

        protected String name;

        protected BigDecimal price;

        public abstract void print();

        public abstract BigDecimal getPrice();

}
