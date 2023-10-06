package javaBeginnersGuideProjects.introducingClassesObjectsAndMethodsChapter4;

public class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // assign values to the fields in minivan
        minivan.passengers = 8;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to the fields of sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // compute the ranges assuming a full tank of gas
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Minivan can carry " + minivan.passengers
                            + " with the range of " + range1);
        System.out.println("Sports car can carry " + sportscar.passengers
                + " with the range of " + range1);
    }
}
