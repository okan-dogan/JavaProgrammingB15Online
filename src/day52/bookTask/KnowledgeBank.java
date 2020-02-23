package day52.bookTask;

public interface KnowledgeBank {

    public abstract void takeNote();

    public default void showTableOfContent(){
        System.out.println("Table of Content is = Default");
    }

}
