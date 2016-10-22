package chain_responsibility;

/**
 * Created by Andrey on 10/22/2016.
 */
public interface Handler {
        void showHelp();
        void setSuccessor(Handler handler);
}
