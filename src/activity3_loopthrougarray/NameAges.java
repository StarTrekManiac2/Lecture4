/*
 * Using loops to loop through arrays
 * @author st20155985
 */

// INCOMPLETE

package activity3_loopthrougarray;

public class NameAges
{

    public static void main(String[] args)
    {

        // Declare arrays holding names and ages
        String[] names = { "April", "James", "Mary", "Simon" };
        int[] ages = { 5, 6 , 9, 11 };

        // Declare variable for fetching current iteration in loop below
        int i = 1;

        // Loop through elements in names array
        do
        {
            // Output the current element value and corresponding age array element value
            System.out.println("CHILD " + i + " : " + names[0] + ", " + ages[0]);

            // Increment i to the next iteration
            i++;
        }
        while ((names.length < 4) && (ages.length < 4));    // Until all 4 elements are reached

    }

}
