package javaBeginnersGuideProjects.MethodsAndClassesChapter6;
class ErrorMsg{
    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };

    String getErrorMessage(int i){
        if( i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Invalid Error Code";
    }
}
public class ErrMsg {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();
        System.out.println(err.getErrorMessage(2));
        System.out.println(err.getErrorMessage(19));
    }
}
