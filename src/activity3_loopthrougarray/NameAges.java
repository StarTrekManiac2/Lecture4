/*
 * Using loops to loop through arrays
 * @author st20155985
 */

package activity3_loopthrougarray;

public class NameAges
{

    public static void main(String[] args)
    {

        // Declare arrays holding names and ages
        String[] names = { "April", "James", "Mary", "Simon" };
        int[] ages = { 5, 6 , 9, 11 };

        // Declare variables for loop iteration and to count the children as we loop through
        int index=0;
        int count=1;

        // Loop through elements in the arrays
        do
        {
            // Output current elements from 'names' and 'ages' arrays
            System.out.println("CHILD " + count + ": " + names[index] + ", " + ages[index]);

            // Add to the child count and iterate to next element
            count++;
            index++;
        } while ((index < names.length) && (index < ages.length));

    }

}
