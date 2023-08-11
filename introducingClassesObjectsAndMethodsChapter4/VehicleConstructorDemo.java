package javaBeginnersGuideProjects.introducingClassesObjectsAndMethodsChapter4;
// Add a constructor.
class VehicleConstructor{
    int passengers;
    int fuelcap;
    int mpg;

    // This is a constructor for Vehicle.
    VehicleConstructor(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }


    // Return the range.
    int range(){
        return mpg * fuelcap;
    }

    // Calculate fuel needed per distance
    double fuelNeeded(int miles){
        return (double) miles / mpg;
    }
}
public class VehicleConstructorDemo {
    public static void main(String[] args) {
        // using constructors
        VehicleConstructor minivan = new VehicleConstructor(7,16,21);
        VehicleConstructor sportscar = new VehicleConstructor(2,14,12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);

        System.out.println("To go " + dist + " miles minivan needs " +
                gallons + " gallons of fuel.");

        gallons = sportscar.fuelNeeded(dist);

        System.out.println("To go " + dist + " miles sportscar needs " +
                gallons + " gallons of fuel.");
    }
}
