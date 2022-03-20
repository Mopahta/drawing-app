package sample;

public abstract class Polygon extends ClosedFigure {
    public Point[] points;
    Polygon(Point startPoint, Point ... points) {
        super(startPoint);
        this.points = points;
    }

}
