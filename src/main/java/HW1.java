class HW1 {

    int sum(int a, int b, int c) {
        if (a%2 == 0) {
            return a*b/c;
        }
        if ((a+b)%2 == 0 && (b+c)%2 == 0) {
            return (int)Math.pow(a,c);
        } else {
            return a+b-c;
        }
    }
}
