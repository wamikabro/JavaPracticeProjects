package javaBeginnersGuideProjects.GenericsChapter13;

class BoundedWildCard<T extends Number>{
    T object;

    BoundedWildCard(T object){
        this.object = object;
    }

    void TakeInputObject(BoundedWildCard<? extends Number> object){

    }

}


public class BoundedWildCardDemo {
}
