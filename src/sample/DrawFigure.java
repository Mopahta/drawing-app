package sample;

import javafx.scene.canvas.GraphicsContext;

public class DrawFigure {
    public static void draw(Circle circle, GraphicsContext gc){
        gc.strokeOval(circle.startPoint.x, circle.startPoint.y, circle.radius * 2, circle.radius * 2);
    }

    public static void draw(Ellipse ellipse, GraphicsContext gc) {
        gc.strokeOval(ellipse.startPoint.x, ellipse.startPoint.y, ellipse.a, ellipse.b);
    }

    public static void draw(Line line, GraphicsContext gc) {
        gc.strokeLine(line.startPoint.x, line.startPoint.y, line.endPoint.x, line.endPoint.y);
    }

    public static void draw(Rectangle rectangle, GraphicsContext gc) {
        gc.strokeRect(rectangle.startPoint.x, rectangle.startPoint.y, rectangle.width, rectangle.height);
    }

    public static void draw(Square square, GraphicsContext gc) {
        gc.strokeRect(square.startPoint.x, square.startPoint.y, square.width, square.width);
    }

    public static void draw(Triangle triangle, GraphicsContext gc) {
        gc.strokePolygon(
                new double[] {triangle.startPoint.x, triangle.points[0].x, triangle.points[1].x},
                new double[] {triangle.startPoint.y, triangle.points[0].y, triangle.points[1].y},
                3);
    }
}
