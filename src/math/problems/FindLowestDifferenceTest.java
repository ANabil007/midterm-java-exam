package math.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLowestDifferenceTest {


    @Test
    public void findSmallestDifferenceOfTwoArrays() {
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int m = array1.length;
        int n = array2.length;

        Assert.assertEquals(1, FindLowestDifference.findSmallestDifference(array1, array2, m, n));



    }
}