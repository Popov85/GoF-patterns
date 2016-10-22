package bridge;

/**
 * Created by Andrey on 10/22/2016.
 */
public class ConcreteWallCreator implements IWallCreator {
        @Override
        public void buildWall() {
                System.out.println("Build wall out of concrete");
        }

        @Override
        public void buildWallWithWindows() {
                System.out.println("Build wall out of concrete");
        }
}
