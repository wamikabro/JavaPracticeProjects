package javaBeginnersGuideProjects.introducingClassesObjectsAndMethodsChapter4;

public class RetMeth {
    public static void main(String[] args) {
        VehicleReturning minivan = new VehicleReturning();
        VehicleReturning sportscar = new VehicleReturning();

        int range1, range2;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        range1 = minivan.range(); // display range of minivan
        range2 = sportscar.range(); // display range of sportscar.

        System.out.println("Minivan can carry " + minivan.passengers +
                " with range of " + range1 + " Miles");
        System.out.print("Sportscar can carry " + sportscar.passengers +
                " with range of " + range2 + " Miles.");
    }
}
