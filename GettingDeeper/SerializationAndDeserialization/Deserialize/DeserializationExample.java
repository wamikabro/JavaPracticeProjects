package javaBeginnersGuideProjects.GettingDeeper.SerializationAndDeserialization.Deserialize;

import javaBeginnersGuideProjects.GettingDeeper.SerializationAndDeserialization.Student;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        String fileName =
                "C:\\Users\\INSPIRE COMP" +
                        "\\Downloads\\Files\\Projects" +
                        "\\JavaProjects2022\\javaBeginnersGuideProjects" +
                        "\\GettingDeeper\\SerializationAndDeserialization" +
                        "\\TestFile.txt";

        try{
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\INSPIRE COMP" +
                    "\\Downloads\\Files\\Projects" +
                    "\\JavaProjects2022\\javaBeginnersGuideProjects" +
                    "\\GettingDeeper\\SerializationAndDeserialization" +
                    "\\TestFile.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Student student1 = (Student) objectInputStream.readObject();

            System.out.println(student1.studentRollNo);
            System.out.println(student1.studentName);

            fileInputStream.close();
            objectInputStream.close();
        }catch (Exception ex){
            System.out.println("Some issue occurred.");
        }


    }
}
