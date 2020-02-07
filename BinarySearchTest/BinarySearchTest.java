/*

 */

package binarysearchtest;


public class BinarySearchTest {


    public static void main(String[] args) {
 Integer[] numbers = {0, 2, 4, 6, 8, 10, 12, 14};
        System.out.println("Integer test array contains...");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println();
 
        String[] fruits = {"Apples", "Oranges", "Peaches", "Watermelon", "Strawberries"};
        System.out.println("String test array contains... ");
        for (int j = 0; j < fruits.length; j++) {
            for (int i = j + 1; i < fruits.length; i++) {
                if (fruits[i].compareTo(fruits[j]) < 0) {
                    String t = fruits[j];
                    fruits[j] = fruits[i];
                    fruits[i] = t;
                }
            }
            System.out.print(fruits[j] + " ");
        }
 
        BinarySearch<Integer> intSearcher = new BinarySearch<Integer>(numbers);
        System.out.println(intSearcher.BinarySearch(2));
        int result = intSearcher.BinarySearch(2);
        if (result == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(intSearcher + "is at index " + result + " in the array");
        }
 
        BinarySearch<String> searcher = new BinarySearch<String>(fruits);
        if (result >= 0) {
            System.out.println(searcher + " is at index " + result + " in the array");
        } else {
            System.out.println(searcher + " is not in the array.");
        }
    }
    
}
