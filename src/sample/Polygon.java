package sample;

public abstract class Polygon extends ClosedFigure{
    Point[] points;
    Polygon(Point startPoint, Point ... points) {
        super(startPoint);
        this.points = points;
    }

}
