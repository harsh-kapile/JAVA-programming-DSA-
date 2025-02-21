package Arrays;

public class LinearSearch {
    public static int linearSearch(String array[], String key){
        for(int i=0; i<array.length; i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int largestInArray(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            if(largest<array[i]){
                largest = array[i];
            }
        }
        return largest;
    }
    public static void main(String args[]) {
        String Menu[] = {"Dosa", "Utapa", "Medu wada", "Idli"};
        String key = "Utapa";
        int index = linearSearch(Menu, key);
        if(index == -1){
            System.out.println("NOT Found");
        } else{
            System.out.println("Key is at index " + index);
        }
        int ko[] = {};
        System.out.println(largestInArray(ko));
    }
}

// Linear Search Algorithm

/**
 * Finds Index of element in a given Array
 * key = 🍒
 * Array - [🫐,🍊,🍒,🍓]        // linear search algo returns 2
 *           0  1   2  3
 */