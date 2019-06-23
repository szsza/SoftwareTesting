package ro.r3activemedia;

import org.junit.Assert;
import org.junit.Test;

public class ArraysUtilsTest {

    @Test
    public void binarySearch_elementExist(){
        int[] array = {1,3,5,7,9,10};
        int n=7;

        int result = new ArraysUtils().binarySearch(array, n);
        Assert.assertEquals(3, result);
    }

    @Test
    public void binarySearch_elementDoesntExist(){
        int[] array = {1,3,5,7,9,10};
        int n=2;

        int result = new ArraysUtils().binarySearch(array, n);
        Assert.assertEquals(-2, result);
    }

    @Test
    public void bubbleSort(){
        int[] array = {3,7,2,4,67,8,12};
        new ArraysUtils().bubbleSort(array);
        int[] expected = new int[]{2,3,4,7,8,12,67};
        Assert.assertArrayEquals(expected, array);
    }
}
