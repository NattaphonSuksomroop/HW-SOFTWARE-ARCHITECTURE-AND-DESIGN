package creational;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class JSONBookMetadataExporter extends BookMetadataExporter{
    @Override
    public void export(PrintStream stream) throws IOException {
        ArrayList<Book> bookList = super.getBookList();
        JSONBookMetadataFormatter jsonFormatter = new JSONBookMetadataFormatter();
        FileWriter file = null;
        for (Book book : bookList){
            jsonFormatter.append(book);
        }
        try{
            file = new FileWriter("jsonOutput.txt");
            jsonFormatter.getJsonArray().writeJSONString(file);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            file.flush();
            file.close();
        }
    }
}
