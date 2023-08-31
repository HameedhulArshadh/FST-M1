package activities;

abstract class Book{
    protected String title;
    abstract void setTitle(String title);
    public String getTitle(){
        return this.title;
    }
}

class MyBook extends Book{
    void setTitle(String title){
        this.title = title;
    }
}

public class Activity5 {
    public static void main(String[] args){
        MyBook twoStates = new MyBook();
        twoStates.setTitle("twoStates");
        System.out.println(twoStates.getTitle());
    }

}
