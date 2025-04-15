/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.testService;

/**
 *
 * @author DELL
 */
public class SpeakingQ {
    private String fullQuestion;   
    private int maxScore;
    private int questionID;

    public SpeakingQ() {
    }

    public SpeakingQ(String fullQuestion, int maxScore, int questionID) {
        this.fullQuestion = fullQuestion;
        this.maxScore = maxScore;
        this.questionID = questionID;
    }

    public String getFullQuestion() {
        return fullQuestion;
    }

    public void setFullQuestion(String fullQuestion) {
        this.fullQuestion = fullQuestion;
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
    
    
}
