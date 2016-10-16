package composite;

import java.math.BigDecimal;

/**
 * Created by Andrey on 10/16/2016.
 */
public class MenuItem extends Component {

        private String description;

        private boolean vegetarian;

        @Override
        public void print() {
                System.out.println("Item = "+this.name);
        }

        @Override
        public BigDecimal getPrice() {
                return this.getPrice();
        }
}
