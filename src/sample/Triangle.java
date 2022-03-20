package sample;

public class Triangle extends Polygon {
    Triangle(Point point1, Point point2, Point point3){
        super(point1, point2, point3);
    }
    @Override
    double area() {
        double l1 = Math.sqrt(Math.pow(points[1].x - points[0].x, 2) + Math.pow(points[1].y - points[0].y, 2));
        double l2 = Math.sqrt(Math.pow(points[2].x - points[1].x, 2) + Math.pow(points[2].y - points[1].y, 2));
        double l3 = Math.sqrt(Math.pow(points[2].x - points[0].x, 2) + Math.pow(points[2].y - points[0].y, 2));
        double p = (l1 + l2 + l3) / 2;
        return Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
    }

    @Override
    double length() {
        double l1 = Math.sqrt(Math.pow(points[1].x - points[0].x, 2) + Math.pow(points[1].y - points[0].y, 2));
        l1 += Math.sqrt(Math.pow(points[2].x - points[1].x, 2) + Math.pow(points[2].y - points[1].y, 2));
        l1 += Math.sqrt(Math.pow(points[2].x - points[0].x, 2) + Math.pow(points[2].y - points[0].y, 2));
        return l1;
    }
}
