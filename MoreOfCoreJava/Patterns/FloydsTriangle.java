public class FloydsTriangle {
    public static void floydsTriange(int n){
        int counter = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                System.out.print(counter++);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydsTriange(5);
    }
}
