package javaBeginnersGuideProjects.MoreDataTypesAndOperatorsChapter5;

public class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("original message: ");
        System.out.println(msg);

        for(int i=0; i < msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.println("Encoded message: ");
        System.out.println(encmsg);

        for(int i = 0; i < msg.length(); i++)
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.println("Decoded message: ");
        System.out.println(decmsg);

    }
}
