package javaBeginnersGuideProjects.GettingDeeper.SerializationAndDeserialization.Serialize;

import javaBeginnersGuideProjects.GettingDeeper.SerializationAndDeserialization.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentRollNo = 55;
        student1.studentName = "Wamique";

        String fileName =
            "C:\\Users\\INSPIRE COMP" +
                "\\Downloads\\Files\\Projects" +
                "\\JavaProjects2022\\javaBeginnersGuideProjects" +
                "\\GettingDeeper\\SerializationAndDeserialization" +
                "\\TestFile.txt";

        try{
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student1);

            fileOutputStream.close();
            objectOutputStream.close();
        }catch (Exception ex){
            System.out.println("Some Issue Occurred.");
        }
    }
}
