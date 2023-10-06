package javaBeginnersGuideProjects.inheritanceChapter7;
class A1{
    A1(){
        System.out.println("Constructing A.");
    }
}
class B1 extends A1{
    B1(){
        System.out.println("Constructing B.");
    }
}
class C1 extends B1{
    C1(){
        System.out.println("Constructing C.");
    }
}
public class OrderOfConstruction {
    public static void main(String[] args) {
        C1 c = new C1();
    }
}
