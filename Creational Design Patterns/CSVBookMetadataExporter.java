package creational;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.*;
import java.util.ArrayList;

public class CSVBookMetadataExporter extends BookMetadataExporter{
    @Override
    public void export(PrintStream stream) throws IOException {
        ArrayList<Book> bookList = super.getBookList();
        CSVBookMetadataFormatter csvFormatter = new CSVBookMetadataFormatter();
        for (Book book : bookList){
            csvFormatter.append(book);
        }
        String[] text = csvFormatter.getMetadataString().split(" \n ");

        try (CSVPrinter printer = new CSVPrinter(new FileWriter("csvOutput.csv"), CSVFormat.DEFAULT)) {
            for (String s : text){
                printer.printRecord(s.split(","));
            }


//            printer.printRecord("id", "userName", "firstName", "lastName", "birthday");
//            printer.printRecord(1, "john73", "John", "Doe", LocalDate.of(1973, 9, 15));
//            printer.println();
//            printer.printRecord(2, "mary", "Mary", "Meyer", LocalDate.of(1985, 3, 29));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}