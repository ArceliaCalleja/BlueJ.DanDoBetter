 

/**
 * Created by dan on 6/14/17.
 */

import java.util.Scanner;

public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        return firstSegment + secondSegment ;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        return Integer.toString(firstSegment)+ secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        return input.substring(0,2);
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        int total;
        int inicio;
        total=input.length();
        inicio=total - 3;
        return input.substring(inicio,total);
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        boolean esigual=false;
        if (inputValue.compareTo(comparableValue)==0) {
            esigual=true;
        }
        return esigual;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        int inicio=0;
        char middlechar;
        
        if (inputValue.length() % 2 == 0) 
        {
                inicio=(inputValue.length() / 2)-1;
            } 
            else 
            {
            inicio=(inputValue.length() / 2);
        }
        
        middlechar=inputValue.charAt(inicio);
        return middlechar;
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        
        
        return spaceDelimitedString.substring(0,spaceDelimitedString.indexOf(" "));
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        int firstspace=0;
        int secondspace=0;
        String afterFirst;
        String secondWord;
        
        firstspace = spaceDelimitedString.indexOf(" ");
        afterFirst = spaceDelimitedString.substring(firstspace+1);
        //secondspace = afterFirst.indexOf(" ");
        secondWord = afterFirst;
       
        return secondWord;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        Scanner read = new Scanner(stringToReverse);
        String str = read.nextLine();
        String reverse = "";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        
        return reverse;
    }
}
