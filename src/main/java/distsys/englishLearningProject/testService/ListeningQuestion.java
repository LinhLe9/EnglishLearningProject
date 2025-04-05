/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.testService;

import java.util.List;

/**
 *
 * @author DELL
 */
public class ListeningQuestion {
    private String fullSentence;  
    private String correctAnswer;  
    private int maxScore;
    private int questionID;

    public ListeningQuestion(String fullSentence, String correctAnswer, int maxScore, int questionID) {
        this.fullSentence = fullSentence;
        this.correctAnswer = correctAnswer;
        this.maxScore = maxScore;
        this.questionID = questionID;
    }

    public String getFullSentence() {
        return fullSentence;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public void setFullSentence(String fullSentence) {
        this.fullSentence = fullSentence;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    
    public boolean checkAnswer(String userAnswers) {
        return correctAnswer.equals(userAnswers); 
    }
    
}
