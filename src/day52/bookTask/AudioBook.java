package day52.bookTask;

public class AudioBook extends Book {

    double duration;


    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration = duration;
    }

    @Override
    public void displayBookInfo() {

        System.out.println("Audio Book's name is: " + name
                + ", and the author is: " + author
                + " and it has " + duration + " hours content"
        );
    }

    public void listen(){
        System.out.println("I'm listening audio-book");
    }

    @Override
    public void takeNote() {
        System.out.println("I'm taking notes while listening audio-book");
    }

    @Override
    public void showTableOfContent() {
        System.out.println("The content of the audio-book is = "+name+" / "+author);
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", duration=" + duration +
                '}';
    }
}
