package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public abstract class Question {
    private final String question;
    private final HashMap<Integer,Option> choiceMap=new HashMap<>();
    //private int maxResponses=1;

    public Question(String question, Option[] choiceArray) {
        this.question = question;
        //createRandomizedChoiceMap(choiceArray);
        for (int i = 0; i < choiceArray.length; i++) {
            choiceMap.put(i+1,choiceArray[i]);
        }
    }

    public String getQuestion() {
        return question;
    }


    public HashMap<Integer, Option> getChoiceMap() {
        return choiceMap;
    }
}
