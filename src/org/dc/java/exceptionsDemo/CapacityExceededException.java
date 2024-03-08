package org.dc.java.exceptionsDemo;

public class CapacityExceededException extends Exception{
    public CapacityExceededException(String message){
        super("Capacity Exceeded Message from constructor");
    }
}
