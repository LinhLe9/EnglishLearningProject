/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.testService;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class SpeakingExerise {
    private String topic;
    List<SpeakingQuestion> questions;
    
    public SpeakingExerise(String topic) {
        this.topic = topic;
        this.questions = new ArrayList<>();
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public List<SpeakingQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(List<SpeakingQuestion> questions) {
        this.questions = questions;
    }
    
    public void addQuestion(SpeakingQuestion question) {
        questions.add(question);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(topic).append("\n");
        for (SpeakingQuestion question : questions) {
            sb.append(question.getFullQuestion()).append("\n\n");
        }
        return sb.toString();
    }
}
