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
import java.util.Random;

/**
 *
 * @author DELL
 */
public class WritingTest {
    private Map<Integer,List<WritingQ>> mapQuestion;
    
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
                    WritingQ question = new WritingQ(nextLine[2], maxScore,questionID);
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
    for (Map.Entry<Integer, List<WritingQ>> entry : mapQuestion.entrySet()) {
            for (WritingQ word : entry.getValue()) {
                sb.append(word.getFullQuestion()).append("\n");
            }
        }
        return sb.toString();
    }

    public Map<Integer, List<WritingQ>> getMapQuestion() {
        return mapQuestion;
    }

    public void setMapQuestion(Map<Integer, List<WritingQ>> mapQuestion) {
        this.mapQuestion = mapQuestion;
    }
    
    public String getQuestionList(int i ){
        List<WritingQ> questionList = mapQuestion.get(i);
        StringBuilder sb = new StringBuilder();
        for (WritingQ q : questionList) {
            sb.append(q.getFullQuestion()).append("\n\n");
        }
        return sb.toString();
    }
    
    
    public int getRandomTestId() {
        List<Integer> keys = new ArrayList<>(mapQuestion.keySet());
        if (keys.isEmpty()) return -1; 
        Random rand = new Random();
        return keys.get(rand.nextInt(keys.size()));
    }

    
    public  static void main (String args[]){
        WritingTest myW = new WritingTest();
        System.out.println(myW.getQuestionList(1));
    }
}
