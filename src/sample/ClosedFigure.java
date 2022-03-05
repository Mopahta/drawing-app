package sample;

public abstract class ClosedFigure extends Figure {
    ClosedFigure(Point startPoint) {
        super(startPoint);
    }

    abstract double area();
}
