package org.dc.java.FileDemo;

import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String args[]) {

        String data = "This is the content of the sample output file";
        try {
            // Creates a Writer using FileWriter
            FileWriter output = new FileWriter("output.txt");

            // Writes string to the file
            output.write(data);
            System.out.println("Content is written to the sample output file.");

            // Closes the writer
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
