package composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 10/16/2016.
 */
public class BistroMenu extends Component {

        private List<Component> components = new ArrayList<>();

        protected BistroMenu(String name, boolean isItem) {
                super(name, isItem);
        }

        @Override
        public void print() {
                for (Component component : components) {
                        if (!component.isItem) System.out.println("Submenu:" + component.name);
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

        public void add(Component component) {
                components.add(component);
        }

        public void remove(Component component) {
                components.remove(component);
        }
}
