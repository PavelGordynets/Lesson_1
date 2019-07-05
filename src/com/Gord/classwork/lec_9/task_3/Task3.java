package com.Gord.classwork.lec_9.task_3;

import java.util.Arrays;

//+
public class Task3 {
    private static final String STARTS_WITH_SYMBOL = "w";
    private static final String DELIMITER = " ";

        public static void main(String[] args) {
            String[] words = {"hello", "java", "world", "red", "Woody"};

            String result = getFilteredString(words, STARTS_WITH_SYMBOL, DELIMITER);

            String[] filteredWords = result.split(DELIMITER);

            System.out.println(Arrays.toString(filteredWords));


            String[] words_2 = {"hello", "java", "world", "red", "Woody"};
            String j = getFilteredString(words_2, "J", "==");
            System.out.println(j);
        }

        private static String getFilteredString(String[] words, String filter, String delimiter) {
            String result = "";

            for (String word : words) {
                if (word.length() > 0) {
                    Character firstSymbol = word.charAt(0);
                    String stringFirstSymbol = String.valueOf(firstSymbol);
                    boolean isEquals = filter.equalsIgnoreCase(stringFirstSymbol);

                    if (isEquals) {
                        result = result + delimiter + word;
                    }
                }
            }
            result = result.replace(delimiter, "");

            return result;

    }
}
