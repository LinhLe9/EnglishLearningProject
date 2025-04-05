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
public class WordDictionary {
    Map<String, WordInfo> mapWord;
    
    public WordDictionary(){
        mapWord= new HashMap<>();
        loadWordDictionary("dict.csv");  

    }
    public void loadWordDictionary(String filePath){
         try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("data/" + filePath)) {
            if (inputStream == null) {
                System.err.println("Not found file: " + filePath);
                return;  // exit if can not find file
            }
        try (CSVReader reader = new CSVReader(new InputStreamReader(inputStream))) {
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
    
    @Override
    public String toString (){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, WordInfo> entry : mapWord.entrySet()) {
            sb.append(entry.getKey()).append("\n");
            sb.append(entry.getValue().toString()).append("\n\n"); 
        }
        return sb.toString();
    }
    
    public  static void main (String args[]){
        WordDictionary myW = new WordDictionary();
        System.out.println(myW.toString());
    }
}
