package Arrays;

public class Largest_in_Array {
    
    public static int largestInArray(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            if(largest<array[i]){
                largest = array[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int ko[] = {1, 10, 20, 29, 3};
        System.out.println(largestInArray(ko));
    }
}

// CODE FOR STRING TYPE ARRAY:

/*
For a String array, you can find the lexicographically greatest string using the compareTo method. 
Here's the code to find the largest string:

public static String largestInArray(String[] array) {
    String largest = "";  // Initialize to an empty string or you can use `null`
    for (int i = 0; i < array.length; i++) {
        if (largest.compareTo(array[i]) < 0) {
            largest = array[i];
        }
    }
    return largest;
}
 */

 /*
    if (array == null || array.length == 0) {
        throw new IllegalArgumentException("Array cannot be empty.");
    }
 */


/*
1. Problem Statement:
    ▫ Objective: The task is to find the largest element in an array.
    ▫ Arrays can contain elements of any data type, such as integers, strings, or custom objects. The 
      interpretation of "largest" depends on the data type:
        ∘•Integer Arrays: The largest element is the maximum number.
        ∘ String Arrays: The largest element is the lexicographically greatest string 
        (based on alphabetical order). [code for this is above]
2. Time & Space Complexity:
    Naive Approach:
    O(n) time complexity, where n is the number of elements in the array. This is the best you can achieve 
    for an unsorted array because you must visit each element at least once.
    In this approach, you iterate through the array and keep updating the largest element whenever a greater 
    value is encountered.
    O(1) space complexity, since there is no recurrsion so no extra stack involved simple base variables count
3. Edge Cases:
    ▫ Empty Array:
    The function needs to handle this case explicitly. Possible approaches include returning null, throwing 
    an exception, or returning a special value like Integer.MIN_VALUE.
    ▫ Single-Element Array:
    The single element in the array is the largest.
    ▫ Arrays with Negative Numbers:
    Ensure that the initialization of the largest value is appropriate, such as using Integer.MIN_VALUE for 
    integers.
    ▫ Arrays with Identical Elements:
    If all elements are identical, that element is the largest, but you should handle this as a special case 
    if needed.
4. Handling Different Data Types:
    ▫ Primitives:
    Direct comparison of values (e.g., comparing integers or floating-point numbers).
    ▫ Objects:
    For objects like String or custom objects, the "largest" element can be determined based on some 
    criteria. 
    ▫ For String arrays, the comparison is done lexicographically using the compareTo() method.
5. Handling Duplicates:
    If the array contains duplicates of the largest element, you might want to:
    Count how many times the largest element appears.
    Return all the largest elements if there are multiple occurrences.
    Here's code for counting the largest element:
    public static int countLargestElement(int[] array) {
        int largest = Integer.MIN_VALUE;
        int count = 0;
        for (int num : array) {
            if (num > largest) {
                largest = num;
                count = 1;
            } else if (num == largest) {
                count++;
            }
        }
        return count;
    }
6. Streams (Java 8 and Above):
    With Java 8 Streams, you can find the largest element using a more functional programming style.
    Example:
    public static int largestInArrayUsingStream(int[] array) {
        return Arrays.stream(array)
                     .max()
                     .getAsInt();  // Returns an OptionalInt, so .getAsInt() is used to extract the value
    }
7. Optimizations and Efficiency:
    For Sorted Arrays:
    If the array is sorted (ascending or descending), you can directly access the largest element:
    Ascending Order: The largest element is the last element.
    Descending Order: The largest element is the first element.
    This reduces the time complexity to O(1), but sorting the array (if needed) requires O(n log n) time.
    Divide and Conquer approach: It has same time complexity O(n) but it has space complexity of O(log n) 
    since it has to maintain a stack for recurssion. Therefore, it is not best suited for problem statement.

 */