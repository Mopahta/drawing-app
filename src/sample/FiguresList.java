package sample;

public class FiguresList {
    Circle circle;
    Ellipse ellipse;
    Line line;
    Rectangle rectangle;
    Square square;
    Triangle triangle;

    FiguresList(){
            getTriangle();
            getRectangle();
            getLine();
            getEllipse();
            getCircle();
            getSquare();
    }

    private void getTriangle() {
        Point point1 = new Point(0,0);
        Point point2 = new Point(50,40);
        Point point3 = new Point(100,200);
        triangle = new Triangle(point1, point2, point3);
    }

    private void getRectangle() {
        Point point1 = new Point(110,10);
        Point point2 = new Point(150,140);
        rectangle = new Rectangle(point1,point2);
    }

    private void getLine() {
        Point point1 = new Point(0,200);
        Point point2 = new Point(50,250);
        line = new Line(point1, point2);
    }

    private void getEllipse() {
        Point point1 = new Point(400,50);
        ellipse = new Ellipse(point1, 150,200);
    }

    private void getCircle() {
        Point point1 = new Point(400,250);
        circle = new Circle(point1, 50);
    }

    private void getSquare() {
        Point point1 = new Point(500,500);
        Point point2 = new Point(550,550);
        square = new Square(point1, point2);
    }
}
