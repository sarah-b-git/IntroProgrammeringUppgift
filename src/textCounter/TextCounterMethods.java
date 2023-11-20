package textCounter;

import java.util.Scanner;

public class TextCounterMethods {
    Scanner scan = new Scanner(System.in);

    private String text = "";
    private int rowCounter = 0;
    private String[] arrayFromText;
    private int numberCharacters = 0;
    private int numberWords = 0;
    private String longestWord = "";


    //Take user input and save it in a string variable (concatenate so
    // previous rows aren't lost) until the user enters stop
    public void recordInput(){
        System.out.println("Enter some text here to save it. Please use " +
                "single spaces to separate your words!");
        System.out.println("Enter stop on a separate line to end the " +
                "recording.");

        //Two strings: one to keep running list of text(initialized top
        //of class), the other to take in user input and check it for
        //"stop" before adding it to the list
        String text1 = "";

        while(true){
            text1 = scan.nextLine();
            if(text1.equalsIgnoreCase("stop")){
                System.out.println("Goodbye! Here are your results:");
                break;
            }
            //Remove "trailing" whitespace before adding the text to the
            //running string of all text
            text += (text1.trim() + " ");
            //keep track of how many rows of text have been entered,
            //exclusive of the row that contains stop
            rowCounter ++;
        }
    }

    //Method to access the private variable text where user's input
    //was stored
    public String getText(){
        return text;
    }

    //get the number of rows that the user entered
    public int getRowCounter(){
        return rowCounter;
    }

    //take in the String of user text and create an array, each
    //word becomes an object in the array
    public void makeArray(String someText){
        arrayFromText = someText.split(" ");
    }

    //method to access array
    public String[] getArray(){
        return arrayFromText;
    }


    //take in array of user's text and then calculate number of
    //characters of all strings array (excludes spaces)
    public void setNumberCharacters(String[] userTextAsArray){
        for(int i = 0; i < userTextAsArray.length; i++){
           numberCharacters += userTextAsArray[i].length();
        }
    }

    //to be able to print private int number of characters in main
    public int getNumberCharacters(){
        return numberCharacters;
    }

    //take array of user's text and check length, each word occupies one
    //index in the array
    public void setNumberWords(String[] userTextAsArray){

        numberWords = userTextAsArray.length;
    }

    //to be able to print private int number of words in main
    public int getNumberWords(){
        return numberWords;
    }

    //compare length of each string in the array to find the longest word,
    //begin with length of first word and reset longest word if current
    //word length is greater than previous longest word length
    public void setLongestWord(String[] userTextAsArray){


        int wordLength = userTextAsArray[0].length();

        for(int i = 0; i < userTextAsArray.length; i++){
            if(userTextAsArray[i].length() >= wordLength){
                wordLength = userTextAsArray[i].length();
                longestWord = userTextAsArray[i];
            }
        }
    }

    //method to access the longest word
    public String getLongestWord(){
        return longestWord;
    }


}
