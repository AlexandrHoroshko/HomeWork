import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HW2Test {

    private HW2 hw2 = new HW2();

    @Test
    public void shift() {
        int[] Exp = {1,2,3,4,5};
        int[] Act = {4,5,3,1,2};
        assertArrayEquals(hw2.shift(Exp), Act);
    }

    @Test
    public void bubbleSort() {
        int[] Exp = {4,5,2,3,1};
        int[] Act = {1,2,3,4,5};
        assertArrayEquals(hw2.bubbleSort(Exp), Act);
    }

    @Test
    public void insertIntoSort() {
        int[] Exp = {4,5,2,3,1};
        int[] Act = {1,2,3,4,5};
        assertArrayEquals(hw2.insertIntoSort(Exp), Act);
    }

    @Test
    public void intToString() {
        String Act = "123456";
        assertEquals(hw2.intToString(123456), Act);
    }

    @Test
    public void IntToString() {
        String Act = "123456";
        assertEquals(hw2.IntToString(123456), Act);
    }

    @Test
    public void doubleToString() {
        String Act = "123456.0";
        assertEquals(hw2.doubleToString(123456), Act);
    }

    @Test
    public void StringToInt() {
        String Exp = "123456";
        int Act = 123456;
        assertEquals(hw2.StringToInt(Exp), Act);
    }

    @Test
    public void StringToDouble() {
        String Exp = "123456";
        double Act = 123456;
        assertEquals(hw2.StringToDouble(Exp), Act, 0);
    }

    @Test
    public void minLengthInString() {
        String Exp = "123456 12 1";
        int Act = 1;
        assertEquals(hw2.minLengthInString(Exp), Act);
    }

//    @Test
//    public void charNum() {
//        String Exp = "123456";
//        int Act = 6;
//        assertEquals(hw2.CharNum(Exp), Act);
//    }

//    @Test
//    public void deleteLastWordInString() {
//        String Exp = "123456 12";
//        int Act = 123456;
//        assertEquals(hw2.deleteLastWordInString(Exp), Act);
//    }
}