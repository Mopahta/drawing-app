package sample;

public class Line extends OpenFigure{
    Line(Point startPoint, Point endPoint){
        super(startPoint, endPoint);
    }

    @Override
    double length() {
        return Math.sqrt(Math.pow(endPoint.x - startPoint.x, 2) + Math.pow(endPoint.y - startPoint.y, 2));
    }
}
