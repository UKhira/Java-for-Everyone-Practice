/*
 * Read twelve temperature values (one for each month), and display the number of the month with the highest 
 * temperature. For example, according to http://worldclimate.com, the average maximum temperatures for Death 
 * Valley are (in order by month, in degrees Celsius):

 * 18.2 22.6 26.4 31.1 36.6 42.2 45.7 44.5 40.2 33.1 24.2 17.6

 * In this case, the month with the highest temperature (45.7 degrees Celsius) is July, and the program should 
 * display 7.

*/

import java.util.Scanner;

public class III_Temp {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int monthCount = 1;
        double highestTemp = 0;
        int highestMonth = 0;
        String month = "";

        while (monthCount <= 12) {
            System.out.print("Enter temperature: ");
            double temp = input.nextDouble();
            if (highestTemp < temp) {
                highestTemp = temp;
                highestMonth = monthCount;
            }
            monthCount ++;
        }
        switch (highestMonth) {
            case 1: month = "January"; break;
            case 2: month = "Februaray"; break;
            case 3 : month = "March"; break;
            case 4 : month = "April"; break;
            case 5 : month = "May"; break;
            case 6 : month = "June"; break;
            case 7 : month = "July"; break;
            case 8 : month = "August"; break;
            case 9 : month = "September"; break;
            case 10 : month = "October"; break;
            case 11 : month = "November"; break;
            case 12 : month = "December"; break;
        }
        System.out.println("Highest temperature is " + highestTemp + " in " + month);
    }
}
