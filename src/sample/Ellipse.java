package sample;

public class Ellipse extends ClosedFigure{
    int a;
    int b;

    Ellipse(Point startPoint, int a, int b){
        super(startPoint);
        this.a = a;
        this.b = b;
    }

    @Override
    double length() {
        return Math.PI * (a / 2 + b / 2);
    }

    @Override
    double area(){
        return Math.PI * a * b;
    }
}
