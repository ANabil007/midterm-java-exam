package math.problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PrimeNumberTest {
    PrimeNumber obj1 = new PrimeNumber();

    ArrayList expected = new ArrayList<>();

    @Test
    public void listOfPrimeNumbersToFive () {


        expected.add(2);
        expected.add(3);
        expected.add(5);

        Assert.assertEquals(expected, obj1.printPrime(5));
    }

    @Test
    public void listOfPrimeNumbersTo14 () {
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(11);
        expected.add(13);

        Assert.assertEquals(expected, obj1.printPrime(14));






    }


}
