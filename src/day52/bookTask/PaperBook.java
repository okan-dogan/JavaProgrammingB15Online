package day52.bookTask;

public class PaperBook extends Book implements Readable {

    int page;

    public PaperBook(String name, String author, int page) {
        super(name, author);
        this.page=page;
    }

    @Override
    public void displayBookInfo() {

        System.out.println("Paper Book's name is: " + name
                + ", and the author is: " + author
                + " and it has " + page + " pages"
        );
    }

    public void read(){
        System.out.println("I'm reading paper-book");
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                '}';
    }

    @Override
    public void takeNote() {
        System.out.println("I'm taking notes while reading paper-book");
    }

//    @Override
//    public void showTableOfContent() {
//        System.out.println("The content of the paper-book is = "+name+" / "+author);
//    }


}
