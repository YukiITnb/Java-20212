package media;
import javax.print.attribute.standard.Media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book extends Media{

    private static int value;
    private List<String> authors = new ArrayList<String>();
    private Scanner key = new Scanner(System.in);

    public Book(){
        super(value);
        inputBook();
    }

    public void inputBook(){
        List<String> authors = new ArrayList<String>();
        System.out.print("Input numbers of authors: ");
        int count = key.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.println("Input author: ");
            String author =  key.nextLine();
            authors.add(author);
        }
        setAuthors(authors);
    }

    public void addAuthor(String authorName) {
        authors.add(authorName);
    }
    
    public void removeAuthor(String authorName) {
        authors.remove(authorName);
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String toString(){
        String result = "Authors: ";
        for(String author: authors){
            result += "-" + author;
        }
        return result;
    }
}
