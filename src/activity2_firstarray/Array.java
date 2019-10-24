/*
 * First practice of arrays
 * @author st20155985
 */

package activity2_firstarray;

public class Array
{

    public static void main(String[] args)
    {

        // Create an array of String values
        String[] str = { "Much", "More", "Java" };

        // Create an array of Integer values into an Integer array of 3 elements
        int[] num = new int[3];

        // Assign the 3 values of the 3-element-length array of Integers
        num[0] = 100;
        num[1] = 200;
        num[2] = 300;

        // Output length of the declared arrays
        System.out.println("String array length is: " + str.length);
        System.out.println("Integer array length is: " + num.length);

        // Output of each element in each array
        System.out.println(str[0] + " " + str[1] + " " + str[2]);
        System.out.println(num[0] + " " + num[1] + " " + num[2]);

        // Change the 2nd element of String array and output
        str[1] = "Better";
        System.out.println(str[0] + " " + str[1] + " " + str[2]);

    }

}
