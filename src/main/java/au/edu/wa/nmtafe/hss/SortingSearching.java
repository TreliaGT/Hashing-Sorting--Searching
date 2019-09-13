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

    public int[] SortingArray(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }

    public void SearchingArray() {

    }
}
