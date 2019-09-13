/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package au.edu.wa.nmtafe.hss;

import java.util.Scanner;

/**
 *
 * @author V244682
 */
public class HSSMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {36, 29, 31, 125, 139, 131, 115, 105, 111, 40, 119, 47, 105, 57, 122, 109, 124, 115, 43, 120, 43, 27, 27, 32, 61, 37, 127, 29, 113, 121, 58, 114, 126, 53, 114, 96, 12, 127, 28, 42, 39, 113, 42, 18, 44, 18, 28, 48, 125, 107, 114, 34, 133, 45, 120, 30, 127, 31, 116, 146, 58, 109, 23, 105, 63, 27, 44, 105, 99, 41, 128, 121, 116, 125, 118, 44, 37, 113, 124, 37, 48, 127, 25, 109, 7, 31, 141, 46, 13, 27, 43, 117, 116, 27, 7, 68, 40, 31, 115, 124, 42, 128, 52, 71, 118, 117, 38, 27, 106, 33, 117, 116, 132, 104, 123, 35, 113, 122, 42, 117, 119, 32, 61, 37, 127, 29, 113, 121, 58, 114, 126, 53, 114, 96};
        Scanner scan = new Scanner(System.in);
        SortingSearching SS = new SortingSearching();
        
        System.out.println(" do you wish to view UnSorted order? (Y/N)");
        char anwser = scan.next().charAt(0);
        if (anwser == 'Y' || anwser == 'y') {
            DisplayNumbers(numbers);
        } else {
            while (true) {
                numbers = SS.SortingArray(numbers);
                System.out.println("Display Stem & Leaf (1), Search Value (2), Display Sorted array(3), Close Program (4)");
                int choice = scan.nextInt();
                switch (choice) {
                    case 1://Stem & leaf 
                        break;
                    case 2://search value
                        break;
                    case 3://sorted array
                       DisplayNumbers(numbers);
                        break;
                    case 4:
                        System.exit(0);
                           break; 
                }
            }
        }
    }

    public static void DisplayNumbers(int[] numbers) {

        for (int num : numbers) {
            System.out.println(num);
        }
    }

}
