import java.util.List;

public class BookReader extends Book implements ReaderInterface{

    public BookReader(String title, List<String> pages) {
        super(title,pages);
    }

    public void printToScreen() {
        Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
    
}