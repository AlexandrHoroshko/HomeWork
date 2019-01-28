package HWFigure;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Figure {

    Scanner scanner = new Scanner(System.in);

    int square_area(int a) {
        return a * a;
    }

    int square_perimeter(int a) {
        return 4 * a;
    }

    double trigon_area(double a, double h) {
        return 0.5 * a * h;
    }

    int trigon_perimeter(int a, int b, int c) {
        return a + b + c;
    }

    int rectangle_area(int a, int b) {
        return a * b;
    }

    int rectangle_perimeter(int a, int b) {
        return (a + b) * 2;
    }

    double circle_area(double r) {
        return PI * pow(r, 2);
    }

    double circle_perimeter(double r) {
        return 2 * PI * r;
    }
}
