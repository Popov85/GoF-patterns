package bridge;

/**
 * Created by Andrey on 10/22/2016.
 */
public class DefaultBuildingCompany implements IBuildingCompany {

        private IWallCreator wallCreator;

        public void setCreator(IWallCreator wallCreator) {
                this.wallCreator = wallCreator;
        }

        public DefaultBuildingCompany(IWallCreator wallCreator) {
                this.wallCreator = wallCreator;
        }

        @Override
        public void buildFloor() {
                System.out.println("Build floor out of concrete");
        }

        @Override
        public void buildWall() {
                wallCreator.buildWall();
        }

        @Override
        public void buildRoof() {
                System.out.println("Build roof out of concrete");
        }
}
