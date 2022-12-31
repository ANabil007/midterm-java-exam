package math.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {



    @Test
    public void findFactorialRecursiveOfThree() {
        Factorial factorial = new Factorial();
            Assert.assertEquals(6, factorial.findFactorialRecursive(3));

    }
    @Test
    public void findFactorialRecursiveOfFour() {
        Factorial factorial = new Factorial();
        Assert.assertEquals(24, factorial.findFactorialRecursive(4));


    }
}