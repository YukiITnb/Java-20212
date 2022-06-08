package media;

import java.util.*;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<String>();
    private String content;
    private List<String> contentToken = new ArrayList<String>();
    private Map<String, Integer> wordfrequency = new HashMap<>();
    public Book(String title, String category, float cost, ArrayList<String> authors) {
        super(title, category, cost);
        this.authors = new ArrayList<String>(authors);
    }
    public boolean checkAuthorExist(String authorName) {
        for(int i = 0; i < this.authors.size(); i++) {
            if(this.authors.get(i).equals(authorName)) {
                return true;
            }
        }
        return false;
    }
    public void addAuthor(String authorName) {
        if(checkAuthorExist(authorName) == true) {
            System.out.println("Author is already exist");
            return;
        }
        this.authors.add(authorName);
    }
    public void removeAuthor(String authorName) {
        if(checkAuthorExist(authorName) == false) {
            System.out.println("Author is not already exist");
            return;
        }
        this.authors.remove(authorName);
    }
    public void setContent(String content) {
        this.content = content;
        processcontent();
    }

    public void processcontent(){
        String tmp = content.replace('.', ' ');
        String[] tmparray = tmp.split("\\s+");
        Arrays.sort(tmparray);
        for(int i = 0; i < tmparray.length; i++){
            contentToken.add(tmparray[i]);
        }
        for(int i = 0; i < contentToken.size(); i++) {
            if(!wordfrequency.containsKey(contentToken.get(i))) {
                int num = 1;
                for(int j = i + 1; j < contentToken.size(); j++) {
                    if(contentToken.get(i).equals(contentToken.get(j))) {
                        num++;
                    }
                }
                wordfrequency.put(contentToken.get(i), num);
            }
        }
    }

    public String toString() {
        String str = "";
        str += "Title: " + this.getTitle() + "\n";
        str += "Category: " + this.getCategory()  + "\n";
        str += "Cost: " + this.getCost() + "\n";
        str += "Author: \n";
        for(int i = 0; i < authors.size(); i++) {
            str += authors.get(i) + "\n";
        }
        str += "Content length: " + contentToken.size() + "\n";
        str += "Content tokens: " + "\n";
        for(int i = 0; i < contentToken.size(); i++) {
            str += contentToken.get(i) + "\n";
        }
        str += "Word frequency: " + "\n";
        for(Map.Entry<String, Integer> entry: wordfrequency.entrySet()) {
            str += "Key: " + entry.getKey() + " Value: " + entry.getValue() + "\n";  
        }
        return str;
    }

}
