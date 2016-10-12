package bar.foo.composite;

public class Line implements Shape {

    public Line(int point1X, int point1Y, int point2X, int point2Y) {

    }

    @Override
    public void renderShapeToScreen() {
        // logic to render this shape to screen

    }

    @Override
    public Shape[] explodeShape() {
        // making a simple shape explode would return only the shape itself,
        // there are no parts of this shape

        Shape[] shapeParts = { this };

        return shapeParts;
    }

}
