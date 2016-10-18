package composite;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Created by Andrey on 10/16/2016.
 */
public abstract class Component {

        protected String name;

        protected boolean isItem;

        protected BigDecimal price;

        protected String description;

        protected boolean vegetarian;

        protected Component(String name, boolean isItem) {
                this.name = name;
                this.isItem = isItem;
                this.price = BigDecimal.valueOf(Math.random()*10);
                this.description = "No description";
                this.vegetarian = false;
        }

        public abstract void print();

        public abstract BigDecimal getPrice();
}
