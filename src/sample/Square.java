package sample;

public class Square extends Rectangle{
    int width;

    Square(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
        width = Math.abs(startPoint.x - endPoint.x);
    }
}
