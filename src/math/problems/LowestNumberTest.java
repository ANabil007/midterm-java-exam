package math.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LowestNumberTest {

    @Test
    public void lowestNumTest() {
        int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

        Assert.assertEquals(5, LowestNumber.lowestNum(array));


    }
    @Test
    public void lowestNumTest2() {
        int array2[] = new int[]{99, 87, 56, 2, 211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

        Assert.assertEquals(2, LowestNumber.lowestNum(array2));


    }
}