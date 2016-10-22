package chain_responsibility;

/**
 * Created by Andrey on 10/22/2016.
 */
public class SystemHandler implements Handler {

        private Handler handler;

        public void setSuccessor(Handler handler) {
                this.handler = handler;
        }

        @Override
        public void showHelp() {
                System.out.println("System help. Able to handle!");
        }
}
