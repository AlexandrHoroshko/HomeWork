package HWFigure;

import java.util.Scanner;

public class FigureCalculation {

    public static void main(String[] args) {

        Square square = new Square();
        Trigon trigon = new Trigon();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter figure name: ");
        String str = scanner.nextLine().toLowerCase();

        switch (str) {
            case "square":
                int a = square.getSquareParameters();
                System.out.println("Square area = " + square.square_area(a));
                System.out.println("Square perimeter = " + square.square_perimeter(a));
                break;
            case "trigon":
                a = trigon.getTrigonLenght();
                int b = trigon.getTrigonLenght();
                int c = trigon.getTrigonLenght();
                double h = trigon.getTrigonHeight();
                System.out.println("Trigon area = " + trigon.trigon_area(a,h));
                System.out.println("Trigon perimeter = " + trigon.trigon_perimeter(a, b, c));
                break;
            case "rectangle":
                a = rectangle.getRectangleHeight();
                b = rectangle.getRectangleLength();
                System.out.println("Rectangle area = " + rectangle.rectangle_area(a,b));
                System.out.println("Rectangle perimeter = " + rectangle.rectangle_perimeter(a, b));
                break;
            case "circle":
                double r = circle.getCircleParameters();
                System.out.println("Circle area = " + circle.circle_area(r));
                System.out.println("Circle perimeter = " + circle.circle_perimeter(r));
                break;
            default:
                System.out.println("Not supported figure.");
        }
    }
}
