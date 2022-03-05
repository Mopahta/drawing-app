package sample;

public abstract class OpenFigure extends Figure {
    Point endPoint;
    OpenFigure(Point startPoint, Point endPoint) {
        super(startPoint);
        this.endPoint = endPoint;
    }
}
