package decorator;

/**
 * Created by Andrey on 10/16/2016.
 */
public class Mercedes implements Car {
        @Override
        public void go() {
                System.out.println("Mercedes is going...");
        }
}
