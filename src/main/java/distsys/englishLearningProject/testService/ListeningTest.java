/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.testService;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.*;
import java.util.*;

/**
 *
 * @author DELL
 */
public class ListeningTest {
    private Map<Integer,ListeningExercise> mapTest;

    public ListeningTest() {
        mapTest = new HashMap<>();
        loadExercises("listeningQuestion.csv");
    }

    public Map<Integer, ListeningExercise> getMapTest() {
        return mapTest;
    }

    public void setMapTest(Map<Integer, ListeningExercise> mapTest) {
        this.mapTest = mapTest;
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
                if (nextLine.length == 6) {
                    // create a new instance of word detail and add the variables
                    int audioID = Integer.parseInt(nextLine[5]);
                    String audiopath = nextLine[3];
                    int maxScore = Integer.parseInt(nextLine[4]);
                    int questionID = Integer.parseInt(nextLine[0]);
                    ListeningQuestion question = new ListeningQuestion(nextLine[1], nextLine[2], maxScore, questionID);
                    ListeningExercise exercise = mapTest.computeIfAbsent(audioID, k -> new ListeningExercise(audiopath));
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
    
    
    public static void main(String[] args) {
        ListeningTest listeningTest = new ListeningTest();
        listeningTest.getMapTest().forEach((testID, exercise) -> {
            System.out.println("Test ID: " + testID);
            System.out.println(exercise);
        });
    }

}
