package javaBeginnersGuideProjects.introducingDataTypesAndOperatorsChapter2;
/*
* This program attempts to declare a variable in an inner scope with the
same name as one defined in an outer scope
*/
public class NestVar {
    public static void main(String[] args) {
        int count;

        for(count = 0; count < 10; count++){
            System.out.println("This is count " + count );

            // int count; // illegal // uncomment and get the error
            for(count = 0; count < 2; count++)
                System.out.println("This program will give error.");
        }
    }
}
