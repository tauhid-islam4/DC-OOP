package org.dc.java.exceptionsDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionsDemoMulti {

    public static void main(String[] args)
    {

        try {
            openFile();
            //doMath();
            checkCapacity(6);
        } catch (IOException e) {
           System.out.println(e.getMessage());
        } catch (CapacityExceededException arithmeticException) {
            System.out.println(arithmeticException.toString());
        }
    }

    public static void checkCapacity (int capacity) throws CapacityExceededException {
        if (capacity>5) {
            throw new CapacityExceededException("The requested size "+ capacity+ "exceeds the capacity");
        }
    }
    public static void  doMath() throws ArithmeticException{
        int x = 20;
        int div = 0;

        if (div==0) {
            throw new ArithmeticException();
        }
    }
    public static void openFile() throws IOException {

        FileInputStream fos = new FileInputStream("testFile.txt");
            String text = "Hello Durham College! This is OOP 1 class";
            // Converting string to bytes
            //byte[] arr = text.getBytes();
            // Text written in the file

            System.out.println("Read Successfully!");
        }

}
