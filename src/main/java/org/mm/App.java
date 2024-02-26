package org.mm;

import java.util.*;
import java.util.stream.Collectors;

/**
 * challenges
 */
public class App
{


    public static void main( String[] args )
    {
        String str1 = "heather";
        String str2 = "jeremy";








    }







/* returns if test string is an anagram of control string */
    public static boolean isAnagram(String test, String control) {
        if (test.split("").length == control.split("").length) {
            Map<String, Integer> testMap = countChars(test);
            Map<String, Integer> controlMap = countChars(control);
            if (testMap.equals(controlMap)) {
                return true;
            }
        }
        return false;
    }



    /*   takes a string input and counts character *
    *   occurrences and prints a result map */

    public static Map<String, Integer> countChars(String str){

        Map<String, Integer> charMap = new HashMap<>();

        String[] charArr = str.split("");

        for (String c : charArr){
            if (!charMap.containsKey(c)){
                charMap.put(c, 1);
                continue;
            } else {
                charMap.replace(c, charMap.get(c) + 1);
            }
        }
    return charMap;
    }



}
