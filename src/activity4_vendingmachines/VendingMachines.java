/*
 * Using what we've learnt so far, analyze this code and try to visualise it - commented.
 * @author st20155985
 */

package activity4_vendingmachines;

public class VendingMachines
{

    public static void main(String[] args)
    {

        // First Vending Machine arrays of quarterly sales
        int[] vend1_qtr1 = { 4200, 4800, 5000 };
        int[] vend1_qtr2 = { 5200, 5800, 5000 };
        int[] vend1_qtr3 = { 4600, 4900, 5800 };
        int[] vend1_qtr4 = { 5000, 5100, 6100 };

        // Second Vending Machine arrays of quarterly sales
        int[] vend2_qtr1 = { 4200, 4800, 5000 };
        int[] vend2_qtr2 = { 5200, 5800, 5000 };
        int[] vend2_qtr3 = { 4600, 4900, 5800 };
        int[] vend2_qtr4 = { 5000, 5100, 6100 };

        // Create new array of 12 int elements which will represent 12 monthly sums
        int[] sum = new int[12];

        // Declare a total value for the year to be calculated
        int total = 0;

        // For-Loop through very first machine array
        for (int i=0; i<vend1_qtr1.length; i++)
        {
            // Add each quarterly values of the 2 machines together into the sum array
            sum[i] = vend1_qtr1[i] + vend2_qtr1[i];
            sum[i+3] = vend1_qtr2[i] + vend2_qtr2[i];
            sum[i+6] = vend1_qtr3[i] + vend2_qtr3[i];
            sum[i+9] = vend1_qtr4[i] + vend2_qtr4[i];
        }

        // For-Loop through the sum array
        for (int i=0; i<sum.length; i++)
        {
            // Output each monthly sum of sales
            System.out.println("MONTH: \t" + (i+1) + "\t SALES: £" + sum[i]);

            // Add the current-iteration's sum value to the total as we iterate
            total += sum[i];
        }

        // Output the final total representing the total yearly sale
        System.out.println("\nTOTAL YEARLY SALES: £" + total);

    }

}
