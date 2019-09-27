/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.wa.nmtafe.hss.HashTable;

import java.util.ArrayList;

/**
 *
 * @author V244682
 */
public class HSLEntry {
            int stem;
	     ArrayList<Integer> leaves = new ArrayList();   

	    HSLEntry(int stem,  int leaf) 
	    {
	        this.stem = stem;
	        addLeaf(leaf);        
	    }
            
            /**
             * Adds a leaf to the steam
             * @param number 
             */
            public void addLeaf(int number){
                leaves.add(number);
            }
}
