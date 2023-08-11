package javaBeginnersGuideProjects.UsingIOChapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Average the list of user entered numbers.
public class AverageNumbersUsingWrapperClasses {
    public static void main(String[] args) throws IOException {
        // creating BufferedReader using System.in
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0d;
        double average, t;

        System.out.print("How Many Numbers? : ");
        str = bufferedReader.readLine();

        try{
            n = Integer.parseInt(str);
        }catch (NumberFormatException exception){
            System.out.println("Not a number.");
            n = 0;
        }

        System.out.println("Enter " + "values.");
        for(int i = 0; i < n; i++){
            System.out.print(": ");
            str = bufferedReader.readLine();
            try{
                t = Double.parseDouble(str);
            }catch (NumberFormatException exception){
                System.out.println("Not a number.");
                t = 0.0;
            }
            sum += t;
        }
        average = sum / n;
        System.out.println("Average is " + average);
    }
}
