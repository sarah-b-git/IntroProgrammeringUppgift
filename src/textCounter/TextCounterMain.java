package textCounter;

import java.util.Arrays;

public class TextCounterMain {

    public static void main(String[] args) {
        //create object of "logic" class so that its methods can be used
        TextCounterMethods methods = new TextCounterMethods();

        //call the method recordInput- contains instructions for the user and
        // will take in text
        methods.recordInput();

        //create a variable in main class to save the number of rows of text
        // (calculated in during recordInput), then print the result
        int numberRows = methods.getRowCounter();
        System.out.println("Rows of text entered: " + numberRows);

        //Create a variable in the main class that contains the text
        //stored from user input
        String myText = methods.getText();
        //Make an array using the stored text and then get and save the
        // array to be used in the methods that follow
        methods.makeArray(myText);
        String[] myArray = methods.getArray();


        //helpful to see the resulting array printed but not necessary for the assignment
        //System.out.println(Arrays.toString(myArray));

        //Calculate number of characters in the array (excludes spaces) and
        //save it as an int which can be printed from main class
        methods.setNumberCharacters(myArray);
        int numChars = methods.getNumberCharacters();
        System.out.println("Number of characters entered (excluding spaces): "
                + numChars);

        //Count number of Strings in the array, save it as an int in the
        // main class and print it out
        methods.setNumberWords(myArray);
        //int numWord = methods.getNumberWords();
        System.out.println("Number of words entered: " + methods.getNumberWords());

        //Compare the lengths of the words in the array, find the longest and
        //save it as a String before printing it out
        methods.setLongestWord(myArray);
        String showLongest = methods.getLongestWord();
        System.out.println("Longest word entered: " + showLongest);

    }
}
