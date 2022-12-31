package math.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMissingNumberTest {

    @Test
    public void findMissingNumberInArray() {
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        Assert.assertEquals(9, FindMissingNumber.findMissingNumber(array));


    }
    @Test
    public void findMissingNumberInArray2() {
        int [] array2 = new int[]{10, 2, 1, 4, 9, 3, 7, 8, 6};
        Assert.assertEquals(5, FindMissingNumber.findMissingNumber(array2));


    }
}