/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.testService;

/**
 *
 * @author DELL
 */
public class ReadingQuestion {
    private String fullQuestion;  
    private String correctAnswer;  
    private int maxScore;
    private int questionID;

    public ReadingQuestion(String fullQuestion, String correctAnswer, int maxScore, int questionID) {
        this.fullQuestion = fullQuestion;
        this.correctAnswer = correctAnswer;
        this.maxScore = maxScore;
        this.questionID = questionID;
    }

    public String getFullQuestion() {
        return fullQuestion;
    }

    public void setFullQuestion(String fullQuestion) {
        this.fullQuestion = fullQuestion;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
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
