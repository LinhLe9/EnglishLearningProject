/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author DELL
 */
public class WordListByTopic {
    Map<String, List<WordInfoByTopic>> mapWordList;
    
    public WordListByTopic(){
        String csvFile = "wordTopic.csv";  // path the the csv file
        mapWordList= new HashMap<>();
       
        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] nextLine;
            reader.readNext();  // skip the headline
            String previousValue = null;
            String currentValue = null;
            List<WordInfoByTopic> myL = new ArrayList<WordInfoByTopic>();

            while ((nextLine = reader.readNext()) != null) {
                if (nextLine.length == 5) {
                    currentValue = nextLine[4];

                    // Nếu currentValue thay đổi -> lưu nhóm cũ vào map
                    if (previousValue != null && !currentValue.equals(previousValue)) {
                        mapWordList.put(previousValue, new ArrayList<>(myL)); 
                        myL.clear(); // Xóa danh sách cũ
                    }

                    // Thêm từ vào danh sách hiện tại
                    myL.add(new WordInfoByTopic(nextLine[0], nextLine[1], nextLine[2], nextLine[3]));
                    
                    // Cập nhật previousValue
                    previousValue = currentValue;
                } else {
                    System.out.println("Invalid data line: " + String.join(",", nextLine));
                }
            }

            // Sau vòng lặp, lưu nhóm cuối cùng vào map
            if (previousValue != null && !myL.isEmpty()) {
                mapWordList.put(previousValue, new ArrayList<>(myL));
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
        return mapWordList.get(topic);
    }
    
    public List<String> getAllTopics() {
        return new ArrayList<>(mapWordList.keySet());
    }
    
    public  static void main (String args[]){
        WordListByTopic myW = new WordListByTopic();
        System.out.println(myW.toString());
    }
}
