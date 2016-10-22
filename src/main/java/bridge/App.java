package bridge;

/**
 * Created by Andrey on 10/22/2016.
 */
public class App {
        public static void main(String[] args) {
                IWallCreator wallBrick = new BrickWallCreator();
                IWallCreator wallConcrete = new ConcreteWallCreator();
                IBuildingCompany company = new NearSeaBuildingCompany(wallBrick);
                company.buildFloor();
                company.buildWall();
                company.setCreator(wallConcrete);
                company.buildWall();
                company.setCreator(wallBrick);
                company.buildRoof();
        }
}
