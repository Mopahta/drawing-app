package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;


public class Controller {
    @FXML
    private Canvas drawingCanvas;
    private ObservableList<Figures> availableChoices = FXCollections.observableArrayList(
            Figures.Circle, Figures.Ellipse, Figures.Line, Figures.Rectangle, Figures.Square, Figures.Triangle);
    private ObservableList<Integer> strokeWidthChoices = FXCollections.observableArrayList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    @FXML
    private ChoiceBox<Figures> choiceFigure;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private ChoiceBox<Integer> strokeWidth;

    private FiguresList figuresList;
    private GraphicsContext gc;
    private Figures currFigure = Figures.Circle;

    public void initialize(){
        choiceFigure.setItems(availableChoices);
        choiceFigure.setValue(Figures.Circle);
        colorPicker.setValue(Color.AQUA);
        strokeWidth.setItems(strokeWidthChoices);
        strokeWidth.setValue(2);
        gc = drawingCanvas.getGraphicsContext2D();

        figuresList = new FiguresList();
    }

    private void drawShapes(FiguresList figuresList, GraphicsContext gc) {
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);

        DrawFigure.draw(figuresList.circle, gc);
        DrawFigure.draw(figuresList.ellipse, gc);
        DrawFigure.draw(figuresList.line, gc);
        DrawFigure.draw(figuresList.rectangle, gc);
        DrawFigure.draw(figuresList.square, gc);
        DrawFigure.draw(figuresList.triangle, gc);
    }

    public void onCanvasClick(MouseEvent event){
        currFigure = choiceFigure.getValue();
        gc.setStroke(colorPicker.getValue());
        gc.setLineWidth(strokeWidth.getValue());
        Point mousePoint = new Point((int) event.getX(), (int) event.getY());
        if (currFigure == Figures.Circle) {
            figuresList.getCircle(mousePoint);
            DrawFigure.draw(figuresList.circle, gc);
        }
        else if (currFigure == Figures.Ellipse) {
            figuresList.getEllipse(mousePoint);
            DrawFigure.draw(figuresList.ellipse, gc);
        }
        else if (currFigure == Figures.Line) {
            figuresList.getLine(mousePoint);
            DrawFigure.draw(figuresList.line, gc);
        }
        else if (currFigure == Figures.Rectangle) {
            figuresList.getRectangle(mousePoint);
            DrawFigure.draw(figuresList.rectangle, gc);
        }
        else if (currFigure == Figures.Square) {
            figuresList.getSquare(mousePoint);
            DrawFigure.draw(figuresList.square, gc);
        }
        else if (currFigure == Figures.Triangle) {
            figuresList.getTriangle(mousePoint);
            DrawFigure.draw(figuresList.triangle, gc);
        }
    }

    public void onBtnClearClick(MouseEvent event){
        gc.clearRect(0,0,drawingCanvas.getWidth(),drawingCanvas.getHeight());
    }
}
