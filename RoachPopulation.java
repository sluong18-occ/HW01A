/**
 * CS 272 - Fall 2019
 * H01-RoachPopulation.java
 */
package occ.cs272.h01;

/**
 * @author <your OCC login name such as sgilbert>
 * @version <the date>
 *
 */
public class RoachPopulation
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "C02694348";
    public static final String ASSIGNMENT = "H01-A";
    // TODO: Complete the RoachPopulation class
    public static int breed(int start)
    {	
    	return start * 2;
    }
    public static int spray(int start)
    {
    	int result = (int)(start * 0.9); 
    	return result;
    }
    public static int getRoaches(int start)
    {
    	int step = breed(start);
    	int step2 = spray(step);
    	return step2;
    }
    public static void main(String[] args)
    {
    	int beg = 10;
    	for (int i = 0; i < 4; i++)
    	{
    		int result = getRoaches(beg);
    		System.out.println("The number of roaches is: " + result);
    		beg = result;
    	}
    	
    }
    
}
