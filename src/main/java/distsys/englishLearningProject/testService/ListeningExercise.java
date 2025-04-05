/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.testService;

import java.util.*;

/**
 *
 * @author DELL
 */
public class ListeningExercise {
    private String audioPath;
    List<ListeningQuestion> questions;

    public ListeningExercise(String audioPath) {
        this.audioPath = audioPath;
        this.questions = new ArrayList<>();
    }

    public String getAudioPath() {
        return audioPath;
    }

    public void setAudioPath(String audioPath) {
        this.audioPath = audioPath;
    }

    public List<ListeningQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(List<ListeningQuestion> questions) {
        this.questions = questions;
    }
    
    public void addQuestion(ListeningQuestion question) {
        questions.add(question);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(audioPath).append("\n");
        for (ListeningQuestion question : questions) {
            sb.append(question.getFullSentence()).append("\n\n");
        }
        return sb.toString();
    }
}