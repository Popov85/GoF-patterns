package bridge;

/**
 * Created by Andrey on 10/22/2016.
 */
public interface IBuildingCompany {
        void buildFloor();
        void buildWall();
        void buildRoof();
        void setCreator(IWallCreator creator);
}
