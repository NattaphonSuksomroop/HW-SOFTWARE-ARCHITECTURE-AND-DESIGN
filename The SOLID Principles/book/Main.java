import java.util.List;

public class Main {
    public static void main(String[] args){
        ReaderInterface reader = new BookReader("Tyland", List.of("I", "moved", "here", "recently", "too"));
        reader.printToScreen();

        PublisherInterface publisher = new BookPublisher("Tyland", List.of("I", "moved", "here", "recently", "too"));
        publisher.printToFile();
    }
}
