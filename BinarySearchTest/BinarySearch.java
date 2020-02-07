/*

 */

package binarysearchtest;



public class BinarySearch<T extends Comparable<T>>{
    
    private T[] list;
    
    public BinarySearch(T[] input){
        list = input;
    }
    
     public int BinarySearch(Comparable<T> v) {
         int low = 0;
         int high = list.length - 1;
         
         while(low <= high){
             int mid = (low + high) / 2;
             T midVal = list[mid];
                int result = v.compareTo(midVal);
                if (result < 0) {
                    high = mid - 1;
                } else if (result > 0) {
                    low = mid + 1;
                } else {
                    return mid;
                }
         }
         return -1;
     }
    
    
}
