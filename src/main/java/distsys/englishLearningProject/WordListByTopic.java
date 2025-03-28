/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DELL
 */
public class WordListByTopic {
    Map<String, WordInfoByTopic> mapWordList;
    
    public WordListByTopic(){
        String csvFile = "wordTopic.csv";  // path the the csv file
        mapWordList= new HashMap<>();
       
        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] nextLine;
            reader.readNext();  // skip the headline

            while ((nextLine = reader.readNext()) != null) {
                if (nextLine.length == 5) {
                    // create a new instance of word detail and add the variables 
                    mapWordList.put(nextLine[4], new WordInfoByTopic(nextLine[1], nextLine[2], nextLine[3]));
                } else {
                    System.out.println("Invalid data line: " + String.join(",", nextLine));
                }
            }
        } catch (IOException e ) {
            e.printStackTrace();
        } catch (CsvValidationException i){
            i.printStackTrace();
        }

    }
}
