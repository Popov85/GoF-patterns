package composite;

import java.math.BigDecimal;

/**
 * Created by Andrey on 10/16/2016.
 */
public class MenuItem extends Component {

        public MenuItem(String name, boolean isItem) {
                super(name, isItem);
        }

        @Override
        public void print() {
                System.out.println("Component = "+this.name+" / price: "+this.price.setScale(2, BigDecimal.ROUND_HALF_UP));
        }

        @Override
        public BigDecimal getPrice() {
                return this.price;
        }

        @Override
        public String toString() {
                return "Component{" +
                        "name='" + name + '\'' +
                        ", isItem=" + isItem +
                        ", price=" + price +
                        ", description='" + description + '\'' +
                        ", vegetarian=" + vegetarian +
                        '}';
        }
}
