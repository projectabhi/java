package com.borokali.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BubbleSortTest {

    BubbleSort bubbleSort=new BubbleSort();

    @Test
    public void testPrintArray() {
        int[] arr={1,2,4,3,5};
        int[] expRes={1,2,4,3,5};
        bubbleSort.printArray(arr, arr.length);
    }

    public void testBubbleSort() {
    }
}