/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.newWordsService;

/**
 *
 * @author DELL
 */
public class WordInfo {
    private String pronunciation;
    private String definition;
    private String example;

    public WordInfo(String pronunciation, String definition, String example) {
        this.pronunciation = pronunciation;
        this.definition = definition;
        this.example = example;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public String toString(){
        return "/" + pronunciation + "/\n" + definition + "\nExample:" +example;
    }
}
