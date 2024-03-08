package org.dc.java.FileDemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) {

        String data = "This content is written using Buffered Output stream.";

        try {
            // Creates a FileOutputStream
            FileOutputStream file = new FileOutputStream("BufferedOutputStream.txt");

            // Creates a BufferedOutputStream
            BufferedOutputStream output = new BufferedOutputStream(file);

            byte[] array = data.getBytes();

            // Writes data to the output stream
            output.write(array);
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
