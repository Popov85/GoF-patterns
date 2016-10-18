package composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 10/16/2016.
 */
public class Waitress {

        private List<Component> order = new ArrayList<>();

        public static void main(String[] args) {
                Component item1 = new MenuItem("Fish Soup", true);
                Component item2 = new MenuItem("Porridge and Pork", true);
                Component item3 = new MenuItem("Omelette", true);
                Component item4 = new MenuItem("Apple Juice", true);
                Component item5 = new MenuItem("Hot Milk", true);
                Component item6 = new MenuItem("Black Bread", true);
                Component item7 = new MenuItem("White Bread", true);
                Component item8 = new MenuItem("Fresh Fruits", true);
                Component item9 = new MenuItem("Jam", true);
                Component item10 = new MenuItem("Honey", true);
                Component item11 = new MenuItem("Beef Cutlets", true);

                BistroMenu simpleMenu1 = new BistroMenu("Weekend breakfast", false);
                simpleMenu1.add(item3);
                simpleMenu1.add(item7);

                BistroMenu simpleMenu2 = new BistroMenu("Spring dinner", false);
                simpleMenu2.add(item1);
                simpleMenu2.add(item2);
                simpleMenu2.add(item3);
                simpleMenu2.add(item6);

                BistroMenu complexMenu = new BistroMenu("Wedding menu", false);
                complexMenu.add(simpleMenu1);
                complexMenu.add(simpleMenu2);
                complexMenu.add(item4);
                simpleMenu1.add(item6);
                complexMenu.add(item8);
                complexMenu.add(item11);

                Waitress waitress = new Waitress();
                waitress.order.add(complexMenu);
                waitress.order.add(item5);
                waitress.order.add(item9);
                waitress.order.add(item10);

                waitress.printOrder();
        }

        public void printOrder() {
                BigDecimal total = new BigDecimal(0.0);
                for (Component component : order) {
                        component.print();
                        total = total.add(component.getPrice());
                }
                System.out.println("Total price is: "+total.setScale(2, BigDecimal.ROUND_HALF_UP));
        }
}
