package ChainResponsibility;

/**
 * Created by Andrey on 10/22/2016.
 */
public class ButtonHandler implements Handler {

        private Handler handler;

        public void setSuccessor(Handler handler) {
                this.handler = handler;
        }

        @Override
        public void showHelp() {
                System.out.println("Button help. Cannot handle and proceed...");
                setSuccessor(new WindowHandler());
                handler.showHelp();
        }
}
