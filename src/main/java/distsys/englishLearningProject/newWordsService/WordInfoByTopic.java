/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.newWordsService;

/**
 *
 * @author DELL
 */
public class WordInfoByTopic {
    private String word;
    private String pronunciation;
    private String position;
    private String definition;

    public WordInfoByTopic(String word, String pronunciation, String position, String definition) {
        this.word = word;
        this.pronunciation = pronunciation;
        this.position = position;
        this.definition = definition;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    
    @Override
    public String toString() {
        return word + " " + pronunciation + " (" + position + ") :" + definition;
    }
    
    
}
