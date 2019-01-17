import static org.junit.Assert.*;


public class Test {

    private HW1 hw1 = new HW1();


    @org.junit.Test
    public void test() {
        assertEquals(hw1.sum(1,2,3), 0);
    }

    @org.junit.Test
    public void test1() {
        assertEquals(hw1.square_area(2),4);
    }

    @org.junit.Test
    public void test2() {
        assertEquals(hw1.square_perimeter(2),8);
    }

    @org.junit.Test
    public void test3() {
        assertEquals(hw1.trigon_area(1, 2),1,0);
    }

    @org.junit.Test
    public void test4() {
        assertEquals(hw1.trigon_perimeter(2, 2, 2),6);
    }

    @org.junit.Test
    public void test5() {
        assertEquals(hw1.rectangle_area(2, 2),4);
    }

    @org.junit.Test
    public void test6() {
        assertEquals(hw1.rectangle_perimeter(2, 2),8);
    }

    @org.junit.Test
    public void test7() {
        assertEquals(hw1.circle_area(2),12.57, 0.01);
    }

    @org.junit.Test
    public void test8() {
        assertEquals(hw1.circle_perimeter(2),12.57, 0.01);
    }

    @org.junit.Test
    public void test9() {
        assertEquals(hw1.returnSum(11), 1000);
    }

    @org.junit.Test
    public void test10() {
        assertEquals(hw1.returnSum(10), 800);
    }

    @org.junit.Test
    public void test11() {
        assertEquals(hw1.returnSum(9), 800);
    }

    @org.junit.Test
    public void test12() {
        assertEquals(hw1.returnSum(5), 800);
    }

    @org.junit.Test
    public void test13() {
        assertEquals(hw1.returnSum(4), 600);
    }

    @org.junit.Test
    public void test14() {
        assertEquals(hw1.returnSum(1), 600);
    }

    @org.junit.Test
    public void test15() {
        assertEquals(hw1.returnSum(0), 200);
    }

    @org.junit.Test
    public void test16() {
        assertEquals(hw1.returnSum(-1), 0);
    }

    @org.junit.Test
    public void test17() {
        assertNotEquals(hw1.returnSum(-1), 1000);
    }

    @org.junit.Test
    public void test18() {
        assertEquals(hw1.calculateFactorial(1), 1);
    }

    @org.junit.Test
    public void test19() {
        assertEquals(hw1.calculateFactorial(-1), 0);
    }



}
