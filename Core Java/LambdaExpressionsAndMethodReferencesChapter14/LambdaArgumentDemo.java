package javaBeginnersGuideProjects.LambdaExpressionsAndMethodReferencesChapter14;
@FunctionalInterface
interface StringFunc{
    String func(String str);
}
public class LambdaArgumentDemo {
    // changeStr method, asking for Lambda expression
    // in first parameter
    static String changeStr(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda Expressions Expand Java";
        String outStr;

        System.out.println("Here is input string: " + inStr);

        // lambda to reverse string and assign it to StringFunc
        StringFunc reverse = str -> {
            String result = "";

            for(int i = str.length()-1; i>= 0; i--)
                result += str.charAt(i);

            return result;
        };

        // Pass reverse to the first argument of changeStr()
        outStr = changeStr(reverse, inStr);
        System.out.println("The string reversed: " + outStr);

        // Replacing spaces with hyphens.
        // Directly in the call to changeStr()
        outStr = changeStr(str -> str.replace(' ', '_'), inStr);
        System.out.println("The string with spaces replaced: " + outStr);

        // invert the case of the characters in the string
        outStr = changeStr(str -> {
            String result = "";
            char ch;

            for(int i = 0; i < str.length(); i++){
                ch = str.charAt(i);
                if(Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else
                    result += Character.toUpperCase(ch);
            }
            return result;
        }, inStr);

        System.out.println("The string in reversed case: " + outStr);


    }

}
