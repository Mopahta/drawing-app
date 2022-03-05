package sample;

public class Circle extends Ellipse{
    int radius;

    Circle(Point startPoint, int radius) {
        super(startPoint, radius / 2, radius / 2);
        this.radius = radius;
    }
}
