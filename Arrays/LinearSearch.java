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

    public static void main(String args[]) {
        String Menu[] = {"Dosa", "Utapa", "Medu wada", "Idli"};
        String key = "Utapa";
        int index = linearSearch(Menu, key);
        if(index == -1){
            System.out.println("NOT Found");
        } else{
            System.out.println("Key is at index " + index);
        }
    }
}

// Linear Search Algorithm

/**
 * Finds Index of element in a given Array
 * key = 🍒
 * Array - [🫐,🍊,🍒,🍓]        // linear search algo returns 2
 *           0  1   2  3
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */