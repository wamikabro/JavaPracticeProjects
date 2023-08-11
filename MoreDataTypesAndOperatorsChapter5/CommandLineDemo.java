package javaBeginnersGuideProjects.MoreDataTypesAndOperatorsChapter5;

public class CommandLineDemo {
    public static void main(String[] args) {
        System.out.println("There are " + args.length +
                " command-line arguments.");

        System.out.println("they are: ");
        for(int i=0; i<args.length; i++)
            System.out.println("arg[" + i + "]: " + args[i]);
    }
}
