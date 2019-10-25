/*
 * Practicing looping through arrays in reverse (reverse iteration/decrement).
 * @author st20155985
 */

package activity5_reversediteration;

public class Reversed
{

    public static void main(String[] args)
    {

        // Declare arrays containing strings that will spell out a word (also in reverse)
        char[] word1 = { 'd', 'e', 's', 's', 'e', 'r', 't', 's' };
        char[] word2 = { 's', 'p', 'o', 'o', 'n', 's' };
        char[] word3 = { 'd', 'e', 'l', 'i', 'v', 'e', 'r' };

        // Declare variable for use in iteration
        int i = 0;

        System.out.println("============ NORMAL =============");

        // Do-While Loop for printing array elements as full words, WHILE 'i' = 0
        do
        {
            // Initialize variables to collect each array's elements to form a word
            String word1_full = "";
            String word2_full = "";
            String word3_full = "";

            // For-Loop to fetch and store elements in the first word
            for (int j=0; j<word1.length; j++)
            {
                word1_full += word1[j];
            }

            // For-Loop to fetch and store elements in the second word
            for (int j=0; j<word2.length; j++)
            {
                word2_full += word2[j];
            }

            // For-Loop to fetch and store elements in the third word
            for (int j=0; j<word3.length; j++)
            {
                word3_full += word3[j];
            }

            // Output the full words that were formed in the for-loops
            System.out.println(word1_full);
            System.out.println(word2_full);
            System.out.println(word3_full);

            // Iterate so that i becomes 1, ending this loop
            i++;
        } while (i<1);

        System.out.println("============ REVERSE ============");

        // Reset iteration variable to 0
        i = 0;

        // Do-While Loop for printing array elements as REVERSED full words, WHILE 'i' = 0
        do
        {
            String word1_full = "";
            String word2_full = "";
            String word3_full = "";

            for (int j=word1.length-1; j>=0; j--)
            {
                word1_full += word1[j];
            }

            for (int j=word2.length-1; j>=0; j--)
            {
                word2_full += word2[j];
            }

            for (int j=word3.length-1; j>=0; j--)
            {
                word3_full += word3[j];
            }

            System.out.println(word1_full);
            System.out.println(word2_full);
            System.out.println(word3_full);

            // Iterate so that i becomes 1, ending this loop
            i++;
        } while (i<1);

    }

}
