package javaBeginnersGuideProjects.MoreDataTypesAndOperatorsChapter5;

public class StrOps {
    public static void main(String[] args) {
        String str1 = "When it comes to Web programming," +
                "Java is #1";
        String str2 = new String(str1);
        String str3 = "Java strings are powerful";
        int result, index;
        char ch;

        System.out.println("Length of str1: " +
                str1.length());

        for(int i=0; i < str1.length(); i++)
            System.out.println(str1.charAt(i));
        System.out.println();

        if(str1.equals(str2))
            System.out.println("str1 equals str2");
        else
            System.out.println("str1 does not equal str2");

        if(str1.equals(str3))
            System.out.println("str1 equals str3");
        else
            System.out.println("str1 does not equal str3");

        result = str1.compareTo(str3);
        if(result == 0)
            System.out.println("str1 and str3 are equal");
        else if(result < 0)
            System.out.println("str1 is less than str3");
        else
            System.out.println("str1 is greater than str3");

        str2 = "One Two Three One";

        index = str2.indexOf("One");
        System.out.println("index of first occurrence of One: " + index);
        index = str2.lastIndexOf("One");
        System.out.println("index of last occurrence of One: " + index);
    }
}
