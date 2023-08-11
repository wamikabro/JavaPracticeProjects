package javaBeginnersGuideProjects.introducingClassesObjectsAndMethodsChapter4;

public class VehicleReturning {
    int passengers; // number of passengers
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallon

    // Display the range
    int range(){
        return mpg * fuelcap;
    }
}
