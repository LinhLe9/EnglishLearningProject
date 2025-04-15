/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.scoreCalculateService;

/**
 *
 * @author DELL
 */
public class englishCerScore {
    private String name;
    private String equalScore;

    public englishCerScore(String name, String equalScore) {
        this.name = name;
        this.equalScore = equalScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEqualScore() {
        return equalScore;
    }

    public void setEqualScore(String equalScore) {
        this.equalScore = equalScore;
    }

    

    @Override
    public String toString() {
        return "Certificate: " + name +
               "Estimated equally score: " + equalScore ;
    }
}
