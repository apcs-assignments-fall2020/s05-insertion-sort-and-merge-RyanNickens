import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        // YOUR CODE HERE
        ArrayList<Integer> sorted = new ArrayList<Integer>(); 
        //for loop to get and compare indexes
        for (int i = 0; i < list.size(); i++) {
            int atm = list.indexOf(i);
            int second = i;
            while((second > 0) && (list.indexOf(second - 1) > atm)) {
                list.set(second, list.indexOf(second - 1));
                second--;
            }
            //setting sorted array value of atm @ j index
            sorted.set(second, atm);
        }
        return sorted;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        //empty array for values to be added into
        int[] sorted = new int[arr1.length + arr2.length];
        //setting variables
        int first = 0;
        int second = 0;
        int third = 0;
        //code for multiple cases
        //tells where to put values once compared
        //used couners to track where i was in the array
        while (first < arr1.length && second < arr2.length) {
            if (arr1[first] < arr2[second]) {
                sorted[third] = arr1[first];
                first++;
                third++;
            } 
            else {
                sorted[third] = arr2[second];
                second++;
                third++;
            }
        }         
        while (first < arr1.length) {
            sorted[third] = arr1[first];
            first++;
            third++;
        }          
        while (second < arr2.length) {
            sorted[third] = arr2[second];
            second++;
            third++;
        }       
        return sorted;
    }

    public static void main(String[] args) {
        // You can test your code here
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(7);
        //System.out.println(insertionSort(list));
        int[] arr1 = new int[]{ 1,3,5,7,9 }; 
        int[] arr2 = new int[]{ 2,4,6,8,10 }; 
        //System.out.println(merge(arr1, arr2));
        }
}
