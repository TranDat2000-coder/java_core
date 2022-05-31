package main;

import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
    	
    	Calendar cal = Calendar.getInstance();
    	
    	cal.set(Calendar.MONDAY, month - 1);    	
    	cal.set(Calendar.DAY_OF_MONTH, day);
    	cal.set(Calendar.YEAR, year);
    	String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
   		return dayOfWeek;

    }

}

public class Solution {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int year = scanner.nextInt();
		
		
		System.out.println(Result.findDay(month, day, year));
	}
}
