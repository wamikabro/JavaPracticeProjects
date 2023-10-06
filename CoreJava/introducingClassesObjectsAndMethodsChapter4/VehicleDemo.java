package javaBeginnersGuideProjects.introducingClassesObjectsAndMethodsChapter4;

// This class declares an object of the type Vehicle.
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        // assign values to fields in minivan
        minivan.passengers = 8;
        minivan.fuelcap = 14;
        minivan.mpg = 31;


        // compute the range assuming a full tank of gas
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers +
                " with the range of " + range);
    }

}
