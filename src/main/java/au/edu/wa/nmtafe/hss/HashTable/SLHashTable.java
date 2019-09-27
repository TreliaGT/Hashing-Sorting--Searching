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
public class SLHashTable {

    private int TABLE_SIZE;
    private int size;
    private HSLEntry[] table;
    private int primeSize;
    public int index = 0;
    public String lastKey = "0";
   // ArrayList<Integer> Values = new ArrayList();
    
    public SLHashTable() {
        size = 0;
        TABLE_SIZE = 14;
        table = new HSLEntry[TABLE_SIZE+1];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = null;
        }

    }

    /* Function to get number of key-value pairs */
    public int getSize() {
        return size;
    }

    /* Function to insert a key value pair */
    public void insert(int number) {
        if (size == TABLE_SIZE) {
            System.out.println("Table full");
            return;
        }
        
        int stem = number/10;
        int leaf = number % 10;
         if(table[stem] != null){
             table[stem].addLeaf(leaf);
         }else{
             table[stem] = new HSLEntry(stem, leaf);
         }
    }

    /* Function to print hash table */
    public void printHashTable() {
        System.out.println("\nHash Table");
        for (HSLEntry entry : table){
            if (entry != null) {
                String result = "";
                for(int value : entry.leaves){
                    result += " " + value;
                }
                System.out.println (entry.stem + "| " + result);
                
                
            }
        }
        
//
    }

}
