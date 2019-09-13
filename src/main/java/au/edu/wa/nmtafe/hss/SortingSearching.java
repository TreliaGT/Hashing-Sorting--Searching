/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.wa.nmtafe.hss;

import java.lang.reflect.Array;

/**
 *
 * @author V244682
 */
public class SortingSearching {

    /**
     * Bubble sort the array
     *
     * @param array
     * @return
     */
    public int[] SortingArray(int[] array) {
        int n = array.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public void SearchingArray() {

    }
}
