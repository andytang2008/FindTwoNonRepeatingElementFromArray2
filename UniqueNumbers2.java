/*package whatever //do not write package name here */
 
//Java program to find 2 non repeating elements
//in array that has pairs of numbers
 
import java.util.*;
import java.io.*;
 
class UniqueNumbers2 {
   
      //Method to print the 2 non repeating elements in an array
      public static void printSingleNumbers(int[] nums){
       
          /*We use a TreeMap to store the elements
          in the sorted order*/
         TreeMap<Integer, Integer> map = new TreeMap<>();
       
          int n = nums.length;
       
          /*Iterate through the array and check if each
          element is present or not in the map. If the
        element is present, remove it from the array
        otherwise add it to the map*/
       
          for(int i = 0; i<n; i++){
            if(map.containsKey(nums[i]))
                  map.remove(nums[i]);
            else
                map.put(nums[i],1);
        }
		
		   for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				 System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
			}
			
			System.out.println("Treemap = "+map);
          System.out.println("The non-repeating integers are " + map.firstKey() + " " + map.lastKey());
    }
      //Driver code
    public static void main (String[] args) {
        int[] nums = new int[]{2,11,3,11,7,3,9,2};
          printSingleNumbers(nums);
    }
      
}