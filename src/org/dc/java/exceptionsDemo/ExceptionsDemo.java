package org.dc.java.exceptionsDemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionsDemo {
    public static void main(String[] args)
    {
        // Try block to check for exceptions
        try (	// Creating an object of FileOutputStream to write stream or raw data
                 // Adding resource in the Try-with-resources section
                 FileOutputStream fos = new FileOutputStream("testFile.txt"))
        {
            // Custom string input
            String text = "Hello Durham College! This is OOP 1 class";
            // Converting string to bytes
            byte[] arr = text.getBytes();
            // Text written in the file

            fos.write(arr);
            System.out.println("Written Successfully to file!");
        } catch (IOException ioException) {
            System.out.println(ioException.getStackTrace());
        }

    }


}

