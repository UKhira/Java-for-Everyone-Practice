public class AudioBook extends Book {

    private String runTime;

    AudioBook(String title, String author, String runTime){
        super(title, author, 0);        //Inheritions from SuperClass
        this.runTime = runTime;
    }
}
