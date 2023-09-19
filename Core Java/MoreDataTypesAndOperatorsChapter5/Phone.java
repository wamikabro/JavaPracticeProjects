package javaBeginnersGuideProjects.MoreDataTypesAndOperatorsChapter5;

public class Phone {
    public static void main(String[] args) {
        String numbers[][] = {
                {"Tom", "555-3322"},
                {"Mary", "555-4324"},
                {"Wamiq", "222-2323"},
                {"Rachel", "433-4232"}
        };

        int i;

        if(args.length != 1)
            System.out.println("Usage: java Phone <name>");
        else{
            for(i=0; i<numbers.length; i++){
                if(numbers[i][0].equals(args[0])){
                    System.out.println(numbers[i][0] + ": " +
                            numbers[i][i]);
                    break;
                }
                if(i == numbers.length)
                    System.out.println("name not found.");
            }
        }
    }
}
