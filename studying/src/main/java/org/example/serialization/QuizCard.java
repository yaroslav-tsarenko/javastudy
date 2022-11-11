package org.example.serialization;

public class QuizCard {
    String Answer;
    String Question;

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public QuizCard(String answer, String question){
        Answer = answer;
        Question = question;


    }
}
