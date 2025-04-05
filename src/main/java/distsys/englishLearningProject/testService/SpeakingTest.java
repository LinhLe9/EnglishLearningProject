/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.testService;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DELL
 */
public class SpeakingTest {
    private Map<Integer,SpeakingExerise> mapTest;
    
    public SpeakingTest() {
        mapTest = new HashMap<>();
        loadExercises("speakingQuestion.csv");
    }
    
    private void loadExercises(String filePath) {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("data/" + filePath)) {
            if (inputStream == null) {
                System.err.println("Not found file: " + filePath);
                return;  // exit if can not find file
            }
        try (CSVReader reader = new CSVReader(new InputStreamReader(inputStream))) {
            String[] nextLine;
            reader.readNext(); 
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine.length == 5) {
                    // create a new instance of word detail and add the variables
                    int topicID = Integer.parseInt(nextLine[0]);
                    String topic = nextLine[1];
                    int maxScore = Integer.parseInt(nextLine[4]);
                    int questionID = Integer.parseInt(nextLine[2]);
                    SpeakingQuestion question = new SpeakingQuestion(nextLine[3], maxScore, questionID);
                    SpeakingExerise exercise = mapTest.computeIfAbsent(topicID, k -> new SpeakingExerise(topic));
                    exercise.addQuestion(question);
                }
            }
        }
        } catch (IOException e ) {
            e.printStackTrace();
        } catch (CsvValidationException i){
            i.printStackTrace();
        }
    }

    public Map<Integer, SpeakingExerise> getMapTest() {
        return mapTest;
    }

    public void setMapTest(Map<Integer, SpeakingExerise> mapTest) {
        this.mapTest = mapTest;
    }
    
    public static void main(String[] args) {
        SpeakingTest speakingTest = new SpeakingTest();
        speakingTest.getMapTest().forEach((testID, exercise) -> {
            System.out.println("Test ID: " + testID);
            System.out.println(exercise);
        });
    }
    
}
