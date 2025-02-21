import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        // Question 1
        /* 
        int A,B,C,avg;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        avg = (A+B+C)/3;
        System.out.println(avg);
        sc.close();
        System.out.println("wats up my nigga!");
        */
        // Question 2
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of side to get area of Square:");
        float side = sc.nextFloat();
        System.out.println(
            "Area = "+(side*side)
        );
        sc.close();
         */
        // Question 3: Enter cost of 3 items from the user(using float data type)-a pencil, a pen and 
        //             an eraser. You have to output the total  cost of the items back to the user as 
        //             their bill.
        //(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
        /*
        Scanner scn = new Scanner(System.in);
        System.out.print("\nEnter price of pen: ");
        float pen = scn.nextFloat();
        System.out.print("Enter price of pencil: ");
        float pencil = scn.nextFloat();
        System.out.print("Enter price of eraser: ");
        float eraser = scn.nextFloat();

        float sum = pen + pencil + eraser;
        float totalPrice = sum + (0.18f * sum);
        System.out.println("\nToTaL pRiCe including 18% GST("+ (0.18f * sum) + ") = " + totalPrice);

        scn.close();       
         */
        // Question 4: What will be the type of result in thefollowing Java code?
        /*
        byte b = 10;
        short s = 25;
        char c = 'j';
        int i = 15;
        float f = 18.25;
        long l = 1200.0;
        double d = 1250.33;

        result = (f * b) + (i % c) + (d * s);
         */
        // Question 5:(Advanced) Will the following statementgive any error in Java?
        /*
        int $ = 24;
         */
        //double inr = '/';
    }
}

// Compile command
// PS C:\Users\kapil\JAVA Tutorials> javac JavaBasics1.java
// Execution command
// PS C:\Users\kapil\JAVA Tutorials> java JavaBasics1.java