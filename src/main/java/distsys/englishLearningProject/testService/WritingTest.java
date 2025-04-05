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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author DELL
 */
public class WritingTest {
    private Map<Integer,List<WritingQuestion>> mapQuestion;
    
    public WritingTest() {
        mapQuestion = new HashMap<>();
        loadExercises("writingQuestion.csv");    
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
                if (nextLine.length == 4) {
                    // create a new instance of word detail and add the variables
                    int testID = Integer.parseInt(nextLine[0]);
                    int maxScore = Integer.parseInt(nextLine[3]);
                    int questionID = Integer.parseInt(nextLine[1]);
                    WritingQuestion question = new WritingQuestion(nextLine[2], maxScore,questionID);
                    mapQuestion.computeIfAbsent(testID, k -> new ArrayList()).add(question);
                }
            }
        }
        } catch (IOException e ) {
            e.printStackTrace();
        } catch (CsvValidationException i){
            i.printStackTrace();
        }
    }
        
    @Override
    public String toString (){
    StringBuilder sb = new StringBuilder();
    for (Map.Entry<Integer, List<WritingQuestion>> entry : mapQuestion.entrySet()) {
            for (WritingQuestion word : entry.getValue()) {
                sb.append(word.getFullQuestion()).append("\n");
            }
        }
        return sb.toString();
    }

    public Map<Integer, List<WritingQuestion>> getMapQuestion() {
        return mapQuestion;
    }

    public void setMapQuestion(Map<Integer, List<WritingQuestion>> mapQuestion) {
        this.mapQuestion = mapQuestion;
    }
    
    public String getQuestionList(int i ){
        List<WritingQuestion> questionList = mapQuestion.get(i);
        StringBuilder sb = new StringBuilder();
        for (WritingQuestion q : questionList) {
            sb.append(q.getFullQuestion()).append("\n\n");
        }
        return sb.toString();
    }
    
    
    public  static void main (String args[]){
        WritingTest myW = new WritingTest();
        System.out.println(myW.getQuestionList(1));
    }
}
