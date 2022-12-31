package math.problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class UnitTestingMath {
    //Apply Unit testing into each class and methods in this package.
    @Test
    public void listOfPrimeNumbersToFive () {
        PrimeNumber prime = new PrimeNumber();
        int a[] = {2,3,5};
        Assert.assertEquals(a, prime.printPrime(5));



    }
}
