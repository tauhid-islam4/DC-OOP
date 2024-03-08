package org.dc.java.FileDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
    public static void main(String[] args) {

        String data = "This text was written via output stream.";

        try {
            FileOutputStream output = new FileOutputStream("outputStream.txt");

            byte[] array = data.getBytes();

            // Writes byte to the file
            output.write(array);
            System.out.println("Content is written to the sample output stream.");
            output.close();

        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
