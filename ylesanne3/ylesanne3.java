/*
To check how climate is changing, students are processing records of day-by-day temperatures
measured at different locations.

Let us assume that the temperatures recorded at each location are placed in a separate file,
with the name of specific location and each day's temperature on a separate line. Your
program should read the name of the file from the command line. It will then read the data
from the file line by line, put the data into an array, print the name of the location,
and compute and print the following information using separate methods:

-the average temperature at this location,
-the warmest temperature at this location,
-the coldest temperature at this location, and
-the average temperature if we exclude the two extremes.

After printing, the information about one location, the program should check if there are
more locations to process (if they exist in file), and process them if needed (if user
wants to see this information)
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ylesanne3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in file name to process.");
        String fileName = scanner.next();

        try{
            File f = new File(fileName);
            FileInputStream fis = new FileInputStream(f.getAbsolutePath());
            Scanner sc = new Scanner(fis);

            while(sc.hasNextLine()){
                System.out.println("There is more temperature data, press 'enter' to see next location.");
                scanner.nextLine();

                String line = sc.nextLine();
                String str[] = line.split(" ");

                List<String> stringAL = new ArrayList<String>();
                List<Integer> integerAL = new ArrayList<Integer>();

                System.out.print("Location: ");

                stringAL = Arrays.asList(str);
                for(String s: stringAL){
                    if(s.matches("^[0-9]{2}$")){
                        integerAL.add(Integer.parseInt(s));
                    } else {
                        System.out.print(s + " ");
                    }
                }
                System.out.println();

                findAverageTemperature(integerAL);
                findWarmestTemperature(integerAL);
                findColdestTemperature(integerAL);
                findAverageTemperatureWithoutTwoExtremes(integerAL);

                System.out.println();
            }
            sc.close();
        } catch(IOException e){
            e.printStackTrace();
        }



    }
    public static void findAverageTemperature(List<Integer> temperatureData){
        int sum = 0;
        int count = 0;
        for(Integer i: temperatureData){
            sum += i;
            count += 1;
        }
        System.out.println("Average temperature: " + sum/count);

    }

    public static void findWarmestTemperature(List<Integer> temperatureData){
        int warmestTemp = 0;
        for(Integer i: temperatureData){
            if(i > warmestTemp) warmestTemp = i;
        }
        System.out.println("Warmest temperature: " + warmestTemp);
    }

    public static void findColdestTemperature(List<Integer> temperatureData){
        int coldestTemp = 999;
        for(Integer i: temperatureData){
            if(i < coldestTemp) coldestTemp = i;
        }
        System.out.println("Coldest temperature: " + coldestTemp);
    }

    public static void findAverageTemperatureWithoutTwoExtremes(List<Integer> temperatureData){
        int warmestTemp = 0;
        int coldestTemp = 999;
        int sum = 0;
        int count = 0;

        for(Integer i: temperatureData){
            if(i > warmestTemp) warmestTemp = i;
            if(i < coldestTemp) coldestTemp = i;
        }
        for(Integer i: temperatureData){
            if(i == warmestTemp || i == coldestTemp) {

            } else{
                sum += i;
                count += 1;
            }
        }
        System.out.println("Average temperature without two extremes: " + sum/count);
    }
}
