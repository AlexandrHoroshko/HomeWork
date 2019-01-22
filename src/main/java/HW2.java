import java.util.Scanner;
import java.util.*;

public class HW2 {

    int[] shift(int[] a) {
        int j = a.length / 2;
        int y = a.length % 2;
        for (int i = 0; i < j; i++) {
            int v = a[j + i + y];
            a[j + i + y] = a[i];
            a[i] = v;
        }
        return a;
    }

    int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    int[] insertIntoSort(int[] arr) {
        int temp;
        int j;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
        return arr;
    }

    String intToString(int a) {

        int c;
        char m;
        StringBuilder str = new StringBuilder();

        while (a > 0) {
            c = a % 10;
            a = a / 10;
            m = (char) ('0' + c);
            str.append(m);
        }
        return str.reverse().toString();
    }

    String IntToString(int a) {
        String str = Integer.toString(a);
        return str;
    }

    String doubleToString(double a) {
        String str = Double.toString(a);
        return str;
    }

    int StringToInt(String str) {
        int num = Integer.parseInt(str);
        return num;
    }

    double StringToDouble(String str) {
        double num = Double.parseDouble(str);
        return num;
    }

    int minLengthInString(String S) {

        String[] SS = S.split("[\\s.,?!—]+");
        int i = SS.length;
        int[] SSint = new int[SS.length];
        for (i = 0; i <= SS.length - 1; i++) {
            SSint[i] =Integer.parseInt(String.valueOf(SS[i].length()));
        }
        insertIntoSort(SSint);
        return SSint[0];

    } // The length of the smallest word in the text

    int CharNum(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String S = sc.nextLine();
        int k = S.length();
        return k;
    } // number of chars in the text

    String deleteLastWordInString(String S) {

        String[] SS = S.split("[\\s.,?!—]+");
        int i = SS.length - 1;
        SS[i] = " ";
        return Arrays.toString(SS);
    } // Delete Last Word In String

    

}
