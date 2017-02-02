package com;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void mergeTwoValidArrays() {
        int[] arrayOne = new int[] { -5, -4, 0, 4, 100 };
        int[] arrayTwo = new int[] { 1, 3, 5, 500 };
        int[] expectedResult = new int[] { -5, -4, 0, 1, 3, 4, 5, 100, 500 };
        Assert.assertArrayEquals(expectedResult, App.merge(arrayOne, arrayTwo));
    }

    @Test
    public void mergeTwoArraysWithDuplicates() {
        int[] arrayOne = new int[] { 1, 2, 3, 4, 5, 5, 5 };
        int[] arrayTwo = new int[] { 0, 1, 1, 2, 3, 9, 10 };
        int[] expectedResult = new int[] { 0, 1, 1, 1, 2, 2, 3, 3, 4, 5, 5, 5, 9, 10 };
        Assert.assertArrayEquals(expectedResult, App.merge(arrayOne, arrayTwo));
    }

    @Test
    public void mergeTwoSingleItemArrays() {
        int[] arrayOne = new int[] { 1 };
        int[] arrayTwo = new int[] { -1 };
        int[] expectedResult = new int[] { -1, 1 };
        Assert.assertArrayEquals(expectedResult, App.merge(arrayOne, arrayTwo));
    }

    @Test
    public void mergeWithEmptyArray() {
        int[] arrayOne = new int[] {};
        int[] arrayTwo = new int[] { 1, 6, 7 };
        int[] expectedResult = new int[] { 1, 6, 7 };
        Assert.assertArrayEquals(expectedResult, App.merge(arrayOne, arrayTwo));
    }

    @Test
    public void mergeWithNullArray() {
        int[] arrayOne = new int[] { 1, 2, 3, 5 };
        int[] arrayTwo = null;
        int[] expectedResult = new int[] { 1, 2, 3, 5 };
        Assert.assertArrayEquals(expectedResult, App.merge(arrayOne, arrayTwo));
    }

}
