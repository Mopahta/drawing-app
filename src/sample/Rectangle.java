package sample;

public class Rectangle extends Polygon {
    int width;
    int height;

    Rectangle(Point startPoint, Point endPoint){
        super(startPoint, endPoint);
        width = Math.abs(endPoint.x - startPoint.x);
        height = Math.abs(endPoint.y - startPoint.y);
    }
    @Override
    double area() {
        return width * height;
    }

    @Override
    double length() {
        return width * 2 + height * 2;
    }
}
