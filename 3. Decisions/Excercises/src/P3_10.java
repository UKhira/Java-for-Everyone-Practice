import java.util.Scanner;
/*
 * The boiling point of water drops by about one degree centigrade for every 300 meters 
 * (or 1,000 feet) of altitude. Improve the program of Exercise P3.9 to allow the user 
 * to supply the altitude in meters or feet.
 */
public class P3_10 {
    public static void main(String[] args) {

        final int WATER_LIQUID_MIN_TEMPERATURE_CELCIUS = 100; 
        final int WATER_LIQUID_MAX_TEMPERATURE_CELCIUS = 0;
        final int WATER_LIQUID_MIN_TEMPERATURE_FAHRENHEIT = 32;
        final int WATER_LIQUID_MAX_TEMPERATURE_FAHRENHEIT = 232;

        final int DEGREE_DROP_1C_FOR_METERS = 300;
        final int DEGREE_DROP_1C_FOR_FEET = 1000;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter m for meter f for feet");
        if (in.hasNext())  {
            String height = in.next();

            if (height.toLowerCase().equals("m") || height.toLowerCase().equals("f")) {
                System.out.print("Enter altitude "); 

                if (in.hasNextDouble()) {
                    double altitude = in.nextDouble();

                    System.out.print("Enter C for Celsius, F for Fahrenheit ");
                    if (in.hasNext()) {
                        String temp = in.next();

                        if (temp.toUpperCase().equals("C") || temp.toUpperCase().equals("F")) {
                            System.out.print("Enter temperature ");

                            if (in.hasNextDouble()) {
                                double degree = in.nextDouble();

                                double init = 0;
                                if (height.toUpperCase().equals("M")) {
                                    init = altitude / DEGREE_DROP_1C_FOR_METERS;
                                }
                                else{
                                    init = altitude / DEGREE_DROP_1C_FOR_FEET;
                                }

                                
                                if (init > 1) {
                                    degree = degree - init;
                                }


                                if (temp.toLowerCase().equals("c")) {

                                    if (degree < WATER_LIQUID_MIN_TEMPERATURE_CELCIUS) {
                                        System.out.println("Water is Solid");
                                    }

                                    else if (degree >= WATER_LIQUID_MAX_TEMPERATURE_CELCIUS) {
                                        System.out.println("Water is Gaseous");
                                    }

                                    else {
                                        System.out.println("Water is Liquid");
                                    }
                                                }
                                else {
                                    degree = degree - 1.8;

                                    if (degree >= WATER_LIQUID_MIN_TEMPERATURE_FAHRENHEIT && degree < WATER_LIQUID_MAX_TEMPERATURE_FAHRENHEIT) {
                                        System.out.println("Water is Liquid");
                                    }

                                    else if (degree >= WATER_LIQUID_MAX_TEMPERATURE_FAHRENHEIT) {
                                        System.out.println("Water is Gaseous");
                                    }
                                    
                                    else {
                                        System.out.println("Water is Solid");
                                    }

                                }

                            }
                            else {
                                System.out.println("Degree must be numeric");
                            }

                        } 
                        else {
                            System.out.println("invalid temperature unit");
                        }

                    } 

                }
                else {
                    System.out.println("Value must be numeric");
                }
            
            }
            else {
                System.out.println("Invalid altitude unit");
            }
                          
        }  
                
    }

}