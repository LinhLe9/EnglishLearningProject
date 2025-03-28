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
public class WordDictionary {
    Map<String, WordInfo> mapWord;
    
    public WordDictionary(){
        String csvFile = "dict.csv";  // path the the csv file
        mapWord= new HashMap<>();
       
        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] nextLine;
            reader.readNext();  // skip the headline

            while ((nextLine = reader.readNext()) != null) {
                if (nextLine.length == 4) {
                    // create a new instance of word detail and add the variables 
                    mapWord.put(nextLine[0], new WordInfo(nextLine[1], nextLine[2], nextLine[3]));
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
    
    public WordInfo getDetail(String word){
        WordInfo result = mapWord.get(word);
        return result;
    }
}
