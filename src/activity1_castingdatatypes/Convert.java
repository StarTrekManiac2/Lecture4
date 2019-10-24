/*
 * Practising the use of casting data type values
 * @author st20155985
 */

package activity1_castingdatatypes;

public class Convert
{

    public static void main(String[] args)
    {

        // Declaring variables
        float daysFloat = 365.25f;
        String weeksString = "52";

        // Create new variable which casts the float value as an int value
        int daysInt = (int) daysFloat;

        // Create new variable which parses a string data value as an integer value
        int weeksInt = Integer.parseInt(weeksString);

        // Output the calculated number of days in a week
        int week = (daysInt/weeksInt);
        System.out.println("Days per week: " + week);

    }

}
