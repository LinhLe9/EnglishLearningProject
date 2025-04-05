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
public class ReadingTest {
    private Map<Integer,ReadingExercise> mapTest;

    public ReadingTest() {
        mapTest = new HashMap<>();
        loadExercises("readingQuestion.csv");
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
                    int testID = Integer.parseInt(nextLine[0]);
                    String passage = nextLine[1];
                    int questionID = Integer.parseInt(nextLine[2]);
                    int maxScore = Integer.parseInt(nextLine[5]);
                    
                    ReadingQuestion question = new ReadingQuestion(nextLine[3], nextLine[4], maxScore, questionID);
                    
                    ReadingExercise exercise = mapTest.computeIfAbsent(testID, k -> new ReadingExercise(passage));
                    
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
    public Map<Integer, ReadingExercise> getMapTest() {
        return mapTest;
    }

    public static void main(String[] args) {
        ReadingTest readingTest = new ReadingTest();
        readingTest.getMapTest().forEach((testID, exercise) -> {
            System.out.println("Test ID: " + testID);
            System.out.println(exercise);
        });
    }
}

