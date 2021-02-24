package filehandling_csv;

import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToCsvFile {
    public static void main(String[] args) throws IOException {
        String csv = "data.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv));

        // Create record
        String[] record = "4,David, Miller,Australia, 30".split(",");

        //Write the record to file
        writer.writeNext(record);

        //Close the writer
        writer.close();

    }
}
