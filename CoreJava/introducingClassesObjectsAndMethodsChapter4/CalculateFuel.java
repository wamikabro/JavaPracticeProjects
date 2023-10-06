package javaBeginnersGuideProjects.introducingClassesObjectsAndMethodsChapter4;
/*
* Add a parameterized method that calculate
* required fuel for the distance
*/
class FuelCalculator{
    int passengers;
    int fuelcap;
    int mpg;

    // Return the range.
    int range(){
        return mpg * fuelcap;
    }

    // Calculate fuel needed per distance
    double fuelNeeded(int miles){
        return (double) miles / mpg;
    }
}

public class CalculateFuel {
    public static void main(String[] args) {
        FuelCalculator minivan = new FuelCalculator();
        FuelCalculator sportscar = new FuelCalculator();
        double gallons;
        int dist = 252;

        // assign values to fields of minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // values to sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelNeeded(dist);

        System.out.println("To go " + dist + " miles minivan needs " +
                gallons + " gallons of fuel.");

        gallons = sportscar.fuelNeeded(dist);

        System.out.println("To go " + dist + " miles sportscar needs " +
                gallons + " gallons of fuel.");
    }
}
