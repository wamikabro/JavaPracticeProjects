package javaBeginnersGuideProjects.GettingDeeper.SerializationAndDeserialization;

import java.io.Serializable;

public class StaticAndTransientStudentDemo implements Serializable {
    transient int id; // it won't be serialized
    String name;

    //it won't be serialized because objects don't contain static fields
    static String company="SSS IT Pvt Ltd";

    public StaticAndTransientStudentDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
