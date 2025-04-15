/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.testService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author DELL
 */
public class ReadingExercise {
    private String passage;
    private List<ReadingQ> questions;

    public ReadingExercise(String passage) {
        this.passage = passage;
        this.questions = new ArrayList<>();
    }

    public String getPassage() {
        return passage;
    }

    public void setPassage(String passage) {
        this.passage = passage;
    }

    public List<ReadingQ> getQuestions() {
        return questions;
    }

    public void setQuestions(List<ReadingQ> questions) {
        this.questions = questions;
    }

    public void addQuestion(ReadingQ question) {
        questions.add(question);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(passage).append("\n");
        for (ReadingQ question : questions) {
            sb.append(question.getFullQuestion()).append("\n\n");
        }
        return sb.toString();
    }
}
