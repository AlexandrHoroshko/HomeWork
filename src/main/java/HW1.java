import static java.lang.Math.pow;

class HW1 {

    int sum(int a, int b, int c) {
        if (a%2 == 0)
            return a * b / c;
         else if((a+b)%2 == 0 || (b+c)%2 == 0)
            return (int) pow(a, c);
         else
            return a + b - c;

    }


    private double myPi = 22.0/7.0;

    int square_area(int a) {
        return a*a;
    }

    int square_perimeter(int a) {
        return 4*a;
    }

    double trigon_area(double a, double h) {
        return 0.5*a*h;
    }

    int trigon_perimeter(int a, int b, int c) {
        return a+b+c;
    }

    int rectangle_area(int a, int b) {
        return a*b;
    }

    int rectangle_perimeter(int a, int b) {
        return (a+b)*2;
    }

    double circle_area(double r) {
        return myPi* pow(r,2);
    }

    double circle_perimeter(double r) {
        return 2*myPi*r;
    }  //test8

    int returnSum(int days) {
        int price = 1000;

        if (days > 10) {
            return price;

        } else if (days >= 5) {
            return (int) (price * 0.8);

        } else if (days >= 1) {
            return (int) (price * 0.6);

        } else if (days >=0) {
            return (int) (price * 0.2);
        }

        return 0;
    }

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
    }

    static void reverse(int a[], int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        /*printing the reversed array*/
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }
}
