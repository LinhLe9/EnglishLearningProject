/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject;

/**
 *
 * @author DELL
 */
public class WordInfoByTopic {
    private String pronunciation;
    private String position;
    private String definition;

    public WordInfoByTopic(String pronunciation, String position, String definition) {
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

    @Override
    public String toString() {
        return "/" + pronunciation + "/ (" + position + ") :" + definition;
    }
    
    
}
