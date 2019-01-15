import java.util.Scanner;

/*import java.util.Scanner;
    Scanner myVar = new Scanner(System.in);
    System.out.println(myVar.nextInt());
*/
public class Main {

    public static void main(String[] args) {
        //int a = 10, b = 10, c = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        int a = scanner.nextInt();

        System.out.print("b = ");
        int b = scanner.nextInt();

        System.out.print("c = ");
        int c = scanner.nextInt();

        if (a%2 == 0) {
            int result = a*b/c;
            System.out.println("a*b/c = " + result);
        }
        if ((a+b)%2 == 0 && (b+c)%2 == 0) {
            int result = (int)Math.pow(a,c);
            System.out.println("a^c = " + result);
        } else {
            int result = a+b-c;
            System.out.println("a+b-c = " + result);
        }
    }
}