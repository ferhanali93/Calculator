package filehandling_csv;

import java.io.File;
import java.util.Scanner;

public class ReadFromCsvFIle
{
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("data.csv"));
        sc.useDelimiter(",");   // Set the delimiter pattern
        while (sc.hasNext()){   // returns a boolean value
            System.out.println(sc.next()); // find and return the next complete token from this scanner.
        }
        sc.close(); // closes the scanner

    }
}
