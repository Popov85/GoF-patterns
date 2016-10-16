package composite;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Andrey on 10/16/2016.
 */
public class BistroMenu extends Component {

        private List<Component> components;

        @Override
        public void print() {
                for (Component component : components) {
                        component.print();
                } 
        }

        @Override
        public BigDecimal getPrice() {
                BigDecimal sum = new BigDecimal(0.0);
                for (Component component : components) {
                        sum = sum.add(component.getPrice());
                }
                return sum;
        }
}
