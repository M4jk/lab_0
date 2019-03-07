package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList<String> listOfStrings;

        if (value == null) {
            listOfStrings = new ArrayList<>();
        } else {
            listOfStrings = new ArrayList<>(value.length());
            addElementsToListOfStrings(listOfStrings, value);
        }
        return listOfStrings;
    }

    private void addElementsToListOfStrings(ArrayList<String> listOfStrings, String value) {
        for (int i = 0; i < value.length(); i++) {
            String stringToBeAdded = value.substring(i);
            listOfStrings.add(stringToBeAdded);
        }
        listOfStrings.add("");
    }

}
