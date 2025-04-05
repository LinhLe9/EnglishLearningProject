/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.newWordsService;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.*;
import java.util.*;

/**
 *
 * @author DELL
 */
public class WordListByTopic {
    Map<String, List<WordInfoByTopic>> mapWordList;
    
    public WordListByTopic(){
        mapWordList = new HashMap<>();
        loadWordListByTopic("wordTopic.csv");
    }
    
    public void loadWordListByTopic(String csvFile){
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("data/" + csvFile)) {
            if (inputStream == null) {
                System.err.println("Not found file: " + csvFile);
                return;  // exit if can not find file
            }
            
            try (CSVReader reader = new CSVReader(new InputStreamReader(inputStream))) {
                String[] nextLine;
                reader.readNext();  // skip the headline
                
                String topic = null;

                while ((nextLine = reader.readNext()) != null) {
                    if (nextLine.length == 5) {
                        topic = nextLine[4];

                        mapWordList.computeIfAbsent(topic, k -> new ArrayList<>()).add(new WordInfoByTopic(
                                                                                            nextLine[0], nextLine[1], nextLine[2], nextLine[3]));
                    } else {
                        System.out.println("Invalid data line: " + String.join(",", nextLine));
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<WordInfoByTopic>> entry : mapWordList.entrySet()) {
            sb.append("Topic: ").append(entry.getKey()).append("\n");
            for (WordInfoByTopic word : entry.getValue()) {
                sb.append("   ").append(word).append("\n");
            }
        }
        return sb.toString();
    }
    
    public List<WordInfoByTopic> getWordByTopic(String topic){
        return mapWordList.getOrDefault(topic, new ArrayList<>());
    }
    
    public List<String> getAllTopics() {
        return new ArrayList<>(mapWordList.keySet());
    }
    
    public  static void main (String args[]){
        WordListByTopic myW = new WordListByTopic();
        System.out.println(myW.toString());
    }
}
