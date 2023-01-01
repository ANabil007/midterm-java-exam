package string.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void areAnagramtest() {
        String word1 = "Cat";
        String word2 = "Act";
        String lowerCaseWord1= word1.toLowerCase();
        String lowerCaseWord2= word2.toLowerCase();
        char str1[] = (lowerCaseWord1).toCharArray();
        char str2[] = (lowerCaseWord2).toCharArray();
        Assert.assertEquals(true, Anagram.areAnagram(str1,str2));
    }
}