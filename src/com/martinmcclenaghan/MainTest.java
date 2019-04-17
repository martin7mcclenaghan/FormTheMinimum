package com.martinmcclenaghan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)

public class MainTest {

    private int[] startArray;
    private int expected;

    public MainTest(int[] startArray, int expected) {
        this.startArray = startArray;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Collection<Object> testConditions() {
        return Arrays.asList(new Object[][]{

                {new int[]{5, 7, 9, 5, 7}, 579},
                {new int[]{3, 6, 5, 5, 9, 8,7,6,3,5,9}, 356789},
                {new int[]{6, 7, 8, 7, 6, 6}, 678},
                {new int[]{4, 7, 5, 7}, 457},
                {new int[]{1, 9, 1, 3, 7, 4,7,2,4,5}, 1234579},
                {new int[]{5, 9, 7, 1, 3, 6, 5}, 135679},
        });
    }

    @Test
    public void FormTheMinTest() {
        assertEquals(expected, Main.findMin(startArray));
    }
}
