package com.martinmcclenaghan;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] start = {1, 9, 3, 1, 7, 4, 6, 6, 7};

        System.out.println(findMin(start));


    }

    public static int findMin(int[] start) {

        // convert to sorted (ascending order) array with no duplicates
        int [] noDuplicates = convertToNDArray(start);

        //return integer formed of all elements of sorted array
        //with no duplicates which will always be the minimum number
        return convertToInt(noDuplicates);
    }


    public static int[] convertToNDArray(int[] start) {

        //sort array
        Arrays.sort(start);

        //create arrayList from sorted array
        ArrayList<Integer> startList = new ArrayList<>();

        for (int i : start) {

            startList.add(i);
        }

        //create new arrayList to hold unique elements
        ArrayList<Integer> noDupeList = new ArrayList<>();

        //move through start ArrayList
        for (Integer i : startList) {

            //If this element is not present in noDupeList then add it
            if (!noDupeList.contains(i)) {

                noDupeList.add(i);
            }
        }

        //convert back to int[]
        int[] noDupeArray = new int[noDupeList.size()];

        for (int i = 0; i < noDupeArray.length; i++) {

            noDupeArray[i] = noDupeList.get(i);
        }

        return noDupeArray;

    }

    public static int convertToInt(int[] array) {

        // takes integer array without duplicates and convert to String array
        String[] noDupeString = new String[array.length];

        for (int i = 0; i < array.length; i++) {

            noDupeString[i] = Integer.toString(array[i]);

        }

        //create StringBuilder and add characters
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < noDupeString.length; i++) {

           sb.append(noDupeString[i]);
        }

        //convert StringBuilder to String then to Integer
        return Integer.parseInt(sb.toString());


    }
}
