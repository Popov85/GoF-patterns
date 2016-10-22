package chain_responsibility;

/**
 * Created by Andrey on 10/22/2016.
 */
public class WindowHandler implements Handler {

        private Handler handler;

        public void setSuccessor(Handler handler) {
                this.handler = handler;
        }

        @Override
        public void showHelp() {
                System.out.println("Window help. Cannot handle and proceed...");
                setSuccessor(new SystemHandler());
                handler.showHelp();
        }

}
