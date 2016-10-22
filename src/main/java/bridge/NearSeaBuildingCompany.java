package bridge;

/**
 * Created by Andrey on 10/22/2016.
 */
public class NearSeaBuildingCompany implements IBuildingCompany {

        private IWallCreator wallCreator;

        public void setCreator(IWallCreator wallCreator) {
                this.wallCreator = wallCreator;
        }

        public NearSeaBuildingCompany(IWallCreator wallCreator) {
                this.wallCreator = wallCreator;
        }

        @Override
        public void buildFloor() {
                System.out.println("Build floor out of brick");
        }

        @Override
        public void buildWall() {
                wallCreator.buildWall();
        }

        @Override
        public void buildRoof() {
                System.out.println("Build roof out of brick");
        }
}
