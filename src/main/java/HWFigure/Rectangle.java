package HWFigure;

public class Rectangle extends Figure {


    int getRectangleHeight() {
        System.out.print("Enter rectangle height: ");
        int a = scanner.nextInt();
        return a;
    }

    int getRectangleLength() {
        System.out.print("Enter rectangle length: ");
        int b = scanner.nextInt();
        return b;
    }
}
