import static org.junit.Assert.assertEquals;


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



}
