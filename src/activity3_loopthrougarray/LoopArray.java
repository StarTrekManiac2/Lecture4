/*
 * Using loops to loop through arrays
 * @author st20155985
 */

package activity3_loopthrougarray;

public class LoopArray
{

    public static void main(String[] args)
    {

        // Declare Integer array of numbers
        int[] nums = { 1, 2, 3, 4, 5 };

        // Check if the array has at least 1 element (is not empty)
        if (nums.length > 0)
        {
            // Loop through each element in the array
            for (int i=0; i<nums.length; i++)
            {
                // Output the current element value
                System.out.println("nums[" + i + "] is: " + nums[i]);
            }
        }

    }

}
