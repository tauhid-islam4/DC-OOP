package org.dc.java.arrays;

import java.io.IOException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        /*int[] numbers = new int[5];
        for (int i=0; i<5; i++) {
            System.out.println(numbers[i]);
        }*/
        
        String[] countries = new String[3];
        countries[0] = "England";
        countries[1] = "Canada";
        countries[2] = "Mexico";
        
        System.out.println(countries[countries.length-1]);

        List<String> countriesList = new ArrayList<>();
        countriesList.add("Canada");
        countriesList.add("England");
        countriesList.add("Mexico");

        System.out.println(countriesList);

        countriesList.add("Egypt");
        System.out.println(countriesList);
        System.out.println(countriesList.getLast());

        List<String> newCountriesList = Arrays.asList(countries);
        System.out.println(newCountriesList);
        Arrays.sort(countries);
        List<String> newCountriesList2 = Arrays.asList(countries);
        System.out.println(newCountriesList2);

        Collections.sort(newCountriesList);
        System.out.println(newCountriesList);



    }
}