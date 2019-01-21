import static java.lang.Math.pow;

class HW1 {

    int sum(int a, int b, int c) {
        if (a % 2 == 0)
            return a * b / c;
        else if ((a + b) % 2 == 0 || (b + c) % 2 == 0)
            return (int) pow(a, c);
        else
            return a + b - c;

    }


    private double myPi = 22.0 / 7.0;

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
        return myPi * pow(r, 2);
    }

    double circle_perimeter(double r) {
        return 2 * myPi * r;
    }  //test8

    int returnSum(int days) {
        int price = 1000;

        if (days > 10) {
            return price;

        } else if (days >= 5) {
            return (int) (price * 0.8);

        } else if (days >= 1) {
            return (int) (price * 0.6);

        } else if (days >= 0) {
            return (int) (price * 0.2);
        }

        return 0;
    }  //test 9 - 17

    int calculateFactorial(int n) {

        int result = 1;

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        } else {
            return 0;
        }
    } //test 18 - 19

    void reverse(int a[]) {
        int[] b = new int[a.length];
        int j = a.length;
        for (int i = 0; i < a.length; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        /*printing the reversed array*/
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < a.length; k++) {
            System.out.print(b[k] + " ");
        }
    }

    void shift(int[] a) {
        int j = a.length / 2;
        int y = a.length % 2;
        for (int i = 0; i < j; i++) {
            int v = a[j + i + y];
            a[j + i + y] = a[i];
            a[i] = v;
        }
        /*printing the reversed array*/
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }

    }

    void sortBuble(int[] a) {
        boolean isSorted = false;
        int j;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    isSorted = false;

                    j = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = j;
                }
            }
        }
    }

    void sortInsert(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int k = i - 1;
            int ai = a[i];
            while (a[k] > ai && k >= 0) {
                a[i] = a[k];
                k--;
                a[k] = ai;
            }


        }
    }
}
