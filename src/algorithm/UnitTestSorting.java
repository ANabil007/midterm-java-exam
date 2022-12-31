package algorithm;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        System.out.println(Arrays.toString(sort.selectionSort(unSortedArray)));

        //apply unsorted array to selectionSort.
        System.out.println(Arrays.toString(sort.selectionSort(unSortedArray)));
        //verify if the unsorted array is sorted by the selection sort algorithm.


            Assert.assertEquals(sortedArray,Arrays.toString(sort.selectionSort(unSortedArray)));

        }

        //Now implement Unit test for rest of the soring algorithm...................below





    }

