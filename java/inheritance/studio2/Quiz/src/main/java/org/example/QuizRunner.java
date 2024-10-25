package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String userResponse;
        Integer totalQuestionCount = 0;
        Integer totalCorrectAnswerCount = 0;
        Integer totalCorrectOptions = 0;
        Integer totalCorrectUserOptions = 0;
        ArrayList<Integer> userResponses = new ArrayList<>();
        String q1 = "Which of the following are name of astranaut?";
        Option[] q1Choices = new Option[]{
                new Option("Harry potter"),
                new Option("Neil Armstrong", true),
                new Option("Peter Parker"),
                new Option("Michael Collins", true)
        };
        Checkbox question1 = new Checkbox(q1, q1Choices);
        String q2 = "First president of USA is George Washington";
        Option[] q2Choices = new Option[]{
                new Option("True", true),
                new Option("False")
        };
        TrueOrFalse question2 = new TrueOrFalse(q2,q2Choices);

        String q3 = "Tallest Building?";
        Option[] q3Choices = new Option[]{
                new Option("Burj Khalifa", true),
                new Option("Shangai Tower"),
                new Option("One World Trade Center"),
                new Option("Makkah Royal Clock Tower")
        };
        MultipleChoice question3 = new MultipleChoice(q3,q3Choices);

        ArrayList<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);

        totalQuestionCount = questions.size();

        String newLine=System.lineSeparator();

        System.out.println("****Welcome to the Quiz world****");

        for (Question question: questions){
            userResponses.clear();
            System.out.println(question.getQuestion());
            for(int choiceNum :question.getChoiceMap().keySet()){

                String choice = "\t" + choiceNum + " - " + question.getChoiceMap().get(choiceNum).getContent() + newLine;
                System.out.println(choice);
                if (question.getChoiceMap().get(choiceNum).isCorrect()){
                    userResponses.add(choiceNum)  ;
                }

            }
            totalCorrectOptions = userResponses.size();
            totalCorrectUserOptions = 0;
            for (int i = 0; i < userResponses.size(); i++) {
                System.out.println("Please enter a number: ");
                userResponse = input.nextLine();
                int userRespNum = Integer.parseInt(userResponse);
                if(userResponses.contains(userRespNum)  ){
                    System.out.println("Your answer is correct!");
                    totalCorrectUserOptions++;
                }
                else {
                    System.out.println("Wrong answer");
                }
            }
            if (totalCorrectOptions == totalCorrectUserOptions){
                totalCorrectAnswerCount++;
            }

        }

        System.out.println("You got " + totalCorrectAnswerCount + " of " + totalQuestionCount + " correct");

        System.out.println("****THank you****");
        

    }

}
