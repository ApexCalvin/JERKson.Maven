package io.zipcoder;

import io.zipcoder.utils.Item;
import io.zipcoder.utils.ItemParseException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemParser { //class
    public static List<Item> parseItemList(String valueToParse) {
        String vTP_lowered = valueToParse.toLowerCase();

        String[] splitter = vTP_lowered.split("#{2}");

        System.out.println(Arrays.toString(splitter));

        ArrayList<Item> arrL = new ArrayList<>();

        Item item;

        int exceptionCount = 0;

        for (String string : splitter) {
            try {
                arrL.add(parseSingleItem(string));
            } catch (ItemParseException e) {
                exceptionCount++;
            }
            //try to add in arraylist
            //catch the exception
            //inc exception counter
        }

        return arrL;
    }

    public static Item parseSingleItem(String singleItem) throws ItemParseException {

        String sI_lowered = singleItem.toLowerCase();

        String[] splitter = sI_lowered.split("[;:@^*%!#]");

        Item item;

        if (splitter.length != 8) {
            throw new ItemParseException();
        } else {
            item = new Item(splitter[1], Double.parseDouble(splitter[3]),
                    splitter[5], splitter[7]);
        }

        return item;
    }
}








