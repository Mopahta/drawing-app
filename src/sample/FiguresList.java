package sample;

public class FiguresList {
    Circle circle;
    Ellipse ellipse;
    Line line;
    Rectangle rectangle;
    Square square;
    Triangle triangle;

    FiguresList() {
    }

    public void getTriangle(Point mousePoint) {
        Point point1 = new Point(mousePoint.x + 50, mousePoint.y + 40);
        Point point2 = new Point(mousePoint.x + 25, mousePoint.y + 100);
        triangle = new Triangle(mousePoint, point1, point2);
    }

    public void getRectangle(Point mousePoint) {
        Point point = new Point(mousePoint.x + 40, mousePoint.y + 110);
        rectangle = new Rectangle(mousePoint, point);
    }

    public void getLine(Point mousePoint) {
        Point point = new Point(mousePoint.x + 50, mousePoint.y + 50);
        line = new Line(mousePoint, point);
    }

    public void getEllipse(Point mousePoint) {
        ellipse = new Ellipse(mousePoint, 150,200);
    }

    public void getCircle(Point mousePoint) {
        circle = new Circle(mousePoint, 50);
    }

    public void getSquare(Point mousePoint) {
        Point point = new Point(mousePoint.x + 50, mousePoint.y + 50);
        square = new Square(mousePoint, point);
    }
}
