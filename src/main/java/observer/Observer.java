package observer;

/**
 * Created by Andrey on 10/16/2016.
 */
public interface Observer {
        void subscribe();

        void unsubscribe();

        void update();
}
