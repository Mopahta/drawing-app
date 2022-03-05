package sample;

import java.awt.*;

public abstract class Figure {
    Point startPoint;
    abstract double length();
    Figure(Point startPoint) {
        this.startPoint = startPoint;
    }
}
