package com;

public class App {
    public static int[] merge(int[] arrayOne, int[] arrayTwo) {
        if (arrayOne == null) {
            arrayOne = new int[] {};
        }
        if (arrayTwo == null) {
            arrayTwo = new int[] {};
        }

        int[] result = new int[arrayOne.length + arrayTwo.length];
        int arrayOneIndex = 0;
        int arrayTwoIndex = 0;
        int resultIndex = 0;

        while (resultIndex < result.length) {
            if (arrayTwoIndex >= arrayTwo.length 
                    || (arrayOneIndex < arrayOne.length && arrayTwo[arrayTwoIndex] > arrayOne[arrayOneIndex])) {
                result[resultIndex] = arrayOne[arrayOneIndex];
                arrayOneIndex++;
            } else {
                result[resultIndex] = arrayTwo[arrayTwoIndex];
                arrayTwoIndex++;
            }
            resultIndex++;
        }

        return result;
    }

}
