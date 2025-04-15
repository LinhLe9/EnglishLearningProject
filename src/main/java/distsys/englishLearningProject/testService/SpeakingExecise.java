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
public class SpeakingExecise {
    private String topic;
    List<SpeakingQ> questions;
    
    public SpeakingExecise(String topic) {
        this.topic = topic;
        this.questions = new ArrayList<>();
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public List<SpeakingQ> getQuestions() {
        return questions;
    }

    public void setQuestions(List<SpeakingQ> questions) {
        this.questions = questions;
    }
    
    public void addQuestion(SpeakingQ question) {
        questions.add(question);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(topic).append("\n");
        for (SpeakingQ question : questions) {
            sb.append(question.getFullQuestion()).append("\n\n");
        }
        return sb.toString();
    }
}
