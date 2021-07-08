package com.company;
import java.util.Arrays;

public class MedianOfTwoSortedArray {


    public static void main(String[] args) {

        int[] a = {1,2 };
        int[] b = {3,4};

        int lenA = a.length;
        int lenB = b.length;

        int lenM = lenA + lenB;

        int[] median = new int[lenM];


        System.arraycopy(a, 0, median, 0, lenA);
        System.arraycopy(b, 0, median, lenA, lenB);

        Arrays.sort(median);

        int mid = lenM / 2;


        if (lenM % 2 == 0) {

            System.out.println("Median is " + (double) (median[mid-1] + median[mid]) / 2);

        } else {
            System.out.println("Median is " + median[mid]);

        }

    }

}
