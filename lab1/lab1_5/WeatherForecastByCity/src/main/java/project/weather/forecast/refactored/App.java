package project.weather.forecast.refactored;

import project.weather.forecast.refactored.Ipma;

public class App 
{
    public static void main( String[] args )
    {
        String city = args[0].toLowerCase();
        System.out.println(Ipma.main(city));
    }
}
