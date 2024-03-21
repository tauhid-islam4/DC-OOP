package org.dc.java.LambdaDemo;

import java.util.ArrayList;

public class LambdaDemo {
    interface StringFunction {
        String run(String str);
    }
    public static void main (String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("John Snow");
        names.add("Cersei Lannister");
        names.add("Arya Stark");
        names.add("Daenerys Targaryen");
        names.forEach(str-> {System.out.println(str);});


        StringFunction evil  = (s) -> "Evil " +s+ " !";
        StringFunction good = (s) -> "Good " +s + "!";

        printFormatted(names.get(0), good);
        printFormatted(names.get(1), evil);
        //names.forEach(System.out::println);
    }

    private static void printFormatted(String name, StringFunction attribute) {
            String output = attribute.run(name);
            System.out.println(output);
    }
}
