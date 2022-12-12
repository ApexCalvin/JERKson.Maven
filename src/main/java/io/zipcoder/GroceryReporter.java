package io.zipcoder;

import io.zipcoder.utils.FileReader;
import io.zipcoder.utils.ItemParseException;

public class GroceryReporter { //grocery reporter class
    private final String originalFileText; //global string var

    public GroceryReporter(String jerksonFileName) { //constructor, passes in file

        this.originalFileText = FileReader.readFile(jerksonFileName); //read content of file and store
    }

    @Override
    public String toString() {

        return null;
    }
}
