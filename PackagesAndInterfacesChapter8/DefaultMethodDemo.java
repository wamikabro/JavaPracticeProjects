package javaBeginnersGuideProjects.PackagesAndInterfacesChapter8;
class MyIfImp{
    public int getUserID(){
        return 100;
    }
}
public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIfImp obj = new MyIfImp();

        System.out.println("User ID is " + obj.getUserID());

//        System.out.println("Administrator ID is " + obj.getAdminID());
// idk why it isn't working

        int uID = MyIF.getUniversalID();
    }
}
