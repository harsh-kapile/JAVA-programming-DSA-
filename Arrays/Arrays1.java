package Arrays;
import java.util.*;
// ARRAYS
/**
 * List of elements of SAME type placed in CONTIGUOUS memory location.
 * 0-Based indexing for memory location.
 * Operations in Array - 
 *      1. Create 2. Input 3. Output 4. Update
 *      1. Creation Of Array 
 *            Syntax - dataType arrayName[] = new dataType[size];     // Here 'new' keyword is used to allocate a memory location 
 *                                  OR
 *                     dataType arrayName[] = {val1, val2, val3, ...};
 * Array Function
 *      - arrayName.length;     gives the length/size of the array
 * Passing array as function arguments
 *      If any argument is passed to array via call by value then changes made to argument in outer function
 *      does not reflect in main function,
 *      But, if it is passed by reference then changes made in outer function is updated in main function.
 * 
 */

public class Arrays1 {
    
    public static void main(String args[]) {
        int marks[] = new int[3];      // stores 3 empty values in array (adjusted size)
        
        int numbers[] = {1, 2, 3};

        String subjects[] = {"Math", "Science", "English"}; // Added values for subjects
        Scanner sc = new Scanner(System.in);

        // Array Input 
        for(int i = 0; i < 3; i++){
            System.out.println("Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
        }
        
        // Array Output
        for(int i = 0; i < 3; i++){
            System.out.println(subjects[i] + "=" + marks[i]);
        }

        // Array Update + Understanding Arrays as Function Arguments
        int nonChangeable = 5;
        updateMarks(numbers,nonChangeable);

        // print updated numbers
        System.out.println(nonChangeable);
        System.out.print("Updated numbers: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }

    public static void updateMarks(int num[], int c){
        c = 10;
        for(int i = 0; i < num.length; i++){
            num[i] = num[i] + 3;
        }
    }
}

