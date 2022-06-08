package media;
import java.util.*;;
public class Booktest {
    public static void main(String[] args) {
        ArrayList<String> authors = new ArrayList<String>();
        authors.add("Nguyen Gia Huan");
        Book book = new Book("Ta co 1 quyen hang yeu pho", "Tien Hiep", 100, authors);
        book.setContent("xuyen qua den dai minh co dai lam nghi co 1 quyen gang yeu pho. tu do han di len con duong tru yeu diet ma bao ho nhan gian");
        System.out.println(book.toString());
    }
}
