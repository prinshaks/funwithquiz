package org.example;

public class Checkbox extends Question {
    public Checkbox(String question, Option[] choiceArray) {
        super(question, choiceArray);
        //setMaxResponses(getNumCorrect());
    }
}
