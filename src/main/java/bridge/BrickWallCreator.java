package bridge;

/**
 * Created by Andrey on 10/22/2016.
 */
public class BrickWallCreator implements IWallCreator {
        @Override
        public void buildWall() {
                System.out.println("Build wall out of brick");
        }

        @Override
        public void buildWallWithWindows() {
                System.out.println("Build wall with windows out of brick");
        }
}
