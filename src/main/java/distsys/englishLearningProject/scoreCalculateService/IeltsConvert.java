/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.scoreCalculateService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author DELL
 */
public class IeltsConvert {
    Map mapIeltsConvert;

    public IeltsConvert() {
        mapIeltsConvert = new HashMap<Double,List<englishCerScore>>();
        List<englishCerScore> List1= new ArrayList<>();
        List1.add(new englishCerScore("TOEIC (L+R)","0-50"));
        List1.add(new englishCerScore("TOEFL iBT","0-4"));
        List1.add(new englishCerScore("CEFR","A1"));
        List1.add(new englishCerScore("Duolingo","15-20"));
        List1.add(new englishCerScore("Cambridge PET","-"));
        mapIeltsConvert.put(Double.valueOf(1.0),List1);
        
        List<englishCerScore> List15= new ArrayList<>();
        List15.add(new englishCerScore("TOEIC (L+R)","50-100"));
        List15.add(new englishCerScore("TOEFL iBT","5-9"));
        List15.add(new englishCerScore("CEFR","A1"));
        List15.add(new englishCerScore("Duolingo","20-25"));
        List15.add(new englishCerScore("Cambridge PET","-"));
        mapIeltsConvert.put(Double.valueOf(1.5),List15);
        
        List<englishCerScore> List2= new ArrayList<>();
        List2.add(new englishCerScore("TOEIC (L+R)","100-150"));
        List2.add(new englishCerScore("TOEFL iBT","10-14"));
        List2.add(new englishCerScore("CEFR","A1"));
        List2.add(new englishCerScore("Duolingo","25-30"));
        List2.add(new englishCerScore("Cambridge PET","-"));
        mapIeltsConvert.put(Double.valueOf(2.0),List2);
        
        List<englishCerScore> List25= new ArrayList<>();
        List25.add(new englishCerScore("TOEIC (L+R)","150-200"));
        List25.add(new englishCerScore("TOEFL iBT","15-19"));
        List25.add(new englishCerScore("CEFR","A1"));
        List25.add(new englishCerScore("Duolingo","30-35"));
        List25.add(new englishCerScore("Cambridge PET","-"));
        mapIeltsConvert.put(Double.valueOf(2.5),List25);
        
        List<englishCerScore> List3= new ArrayList<>();
        List3.add(new englishCerScore("TOEIC (L+R)","200–300"));
        List3.add(new englishCerScore("TOEFL iBT","20–24"));
        List3.add(new englishCerScore("CEFR","A2"));
        List3.add(new englishCerScore("Duolingo","35–40"));
        List3.add(new englishCerScore("Cambridge PET","-"));
        mapIeltsConvert.put(Double.valueOf(3.0),List3);
        
        List<englishCerScore> List35= new ArrayList<>();
        List35.add(new englishCerScore("TOEIC (L+R)","300–400"));
        List35.add(new englishCerScore("TOEFL iBT","25–29"));
        List35.add(new englishCerScore("CEFR","A2"));
        List35.add(new englishCerScore("Duolingo","45–50"));
        List35.add(new englishCerScore("Cambridge PET","-"));
        mapIeltsConvert.put(Double.valueOf(3.5),List35);
        
        List<englishCerScore> List4= new ArrayList<>();
        List4.add(new englishCerScore("TOEIC (L+R)","400–500"));
        List4.add(new englishCerScore("TOEFL iBT","30–31"));
        List4.add(new englishCerScore("CEFR","A2–B1"));
        List4.add(new englishCerScore("Duolingo","55–60"));
        List4.add(new englishCerScore("Cambridge PET","Below PET"));
        mapIeltsConvert.put(Double.valueOf(4.0),List4);
        
        List<englishCerScore> List45= new ArrayList<>();
        List45.add(new englishCerScore("TOEIC (L+R)","500–600"));
        List45.add(new englishCerScore("TOEFL iBT","32–34"));
        List45.add(new englishCerScore("CEFR","B1"));
        List45.add(new englishCerScore("Duolingo","65–75"));
        List45.add(new englishCerScore("Cambridge PET","PET Borderline"));
        mapIeltsConvert.put(Double.valueOf(4.5),List45);
        
        List<englishCerScore> List5= new ArrayList<>();
        List5.add(new englishCerScore("TOEIC (L+R)","600–650"));
        List5.add(new englishCerScore("TOEFL iBT","35–45"));
        List5.add(new englishCerScore("CEFR","B1"));
        List5.add(new englishCerScore("Duolingo","75-85"));
        List5.add(new englishCerScore("Cambridge PET","PET Pass"));
        mapIeltsConvert.put(Double.valueOf(5.0),List5);
        
        List<englishCerScore> List55= new ArrayList<>();
        List55.add(new englishCerScore("TOEIC (L+R)","650-730"));
        List55.add(new englishCerScore("TOEFL iBT","46–59"));
        List55.add(new englishCerScore("CEFR","B1"));
        List55.add(new englishCerScore("Duolingo","90–100"));
        List55.add(new englishCerScore("Cambridge PET","PET Merit"));
        mapIeltsConvert.put(Double.valueOf(5.5),List55);
        
        List<englishCerScore> List6= new ArrayList<>();
        List6.add(new englishCerScore("TOEIC (L+R)","730–785"));
        List6.add(new englishCerScore("TOEFL iBT","60–78"));
        List6.add(new englishCerScore("CEFR","B2"));
        List6.add(new englishCerScore("Duolingo","105–110"));
        List6.add(new englishCerScore("Cambridge PET","PET Pass"));
        mapIeltsConvert.put(Double.valueOf(6.0),List6);
        
        List<englishCerScore> List65= new ArrayList<>();
        List65.add(new englishCerScore("TOEIC (L+R)","785–870"));
        List65.add(new englishCerScore("TOEFL iBT","79–93"));
        List65.add(new englishCerScore("CEFR","B2"));
        List65.add(new englishCerScore("Duolingo","115–120"));
        List65.add(new englishCerScore("Cambridge PET","-"));
        mapIeltsConvert.put(Double.valueOf(6.5),List65);
        
        List<englishCerScore> List7= new ArrayList<>();
        List7.add(new englishCerScore("TOEIC (L+R)","870–900"));
        List7.add(new englishCerScore("TOEFL iBT","94–101"));
        List7.add(new englishCerScore("CEFR","C1"));
        List7.add(new englishCerScore("Duolingo","125–130"));
        List7.add(new englishCerScore("Cambridge PET","-"));
        mapIeltsConvert.put(Double.valueOf(7.0),List7);
        
        List<englishCerScore> List75= new ArrayList<>();
        List75.add(new englishCerScore("TOEIC (L+R)","900–945"));
        List75.add(new englishCerScore("TOEFL iBT","102–109"));
        List75.add(new englishCerScore("CEFR","C1"));
        List75.add(new englishCerScore("Duolingo","135–140"));
        List75.add(new englishCerScore("Cambridge PET","-"));
        mapIeltsConvert.put(Double.valueOf(7.5),List75);
        
        List<englishCerScore> List8= new ArrayList<>();
        List8.add(new englishCerScore("TOEIC (L+R)","945–970"));
        List8.add(new englishCerScore("TOEFL iBT","110–114"));
        List8.add(new englishCerScore("CEFR","C1"));
        List8.add(new englishCerScore("Duolingo","145–150"));
        List8.add(new englishCerScore("Cambridge PET","-"));
        mapIeltsConvert.put(Double.valueOf(8.0),List8);
        
        List<englishCerScore> List85= new ArrayList<>();
        List85.add(new englishCerScore("TOEIC (L+R)","970–990"));
        List85.add(new englishCerScore("TOEFL iBT","115–117"));
        List85.add(new englishCerScore("CEFR","C2"));
        List85.add(new englishCerScore("Duolingo","150–155"));
        List85.add(new englishCerScore("Cambridge PET","-"));
        mapIeltsConvert.put(Double.valueOf(8.5),List85);
        
        List<englishCerScore> List9= new ArrayList<>();
        List9.add(new englishCerScore("TOEIC (L+R)","990"));
        List9.add(new englishCerScore("TOEFL iBT","118–120"));
        List9.add(new englishCerScore("CEFR","C2"));
        List9.add(new englishCerScore("Duolingo","160"));
        List9.add(new englishCerScore("Cambridge PET","-"));
        mapIeltsConvert.put(Double.valueOf(9.0),List9);
    }

    public Map getMapIeltsConvert() {
        return mapIeltsConvert;
    }

    public void setMapIeltsConvert(Map mapIeltsConvert) {
        this.mapIeltsConvert = mapIeltsConvert;
    }
    
    public List<englishCerScore> getAllConvertScore(Double IeltsScore) {
        return (List<englishCerScore>) mapIeltsConvert.get(IeltsScore);
    }   
    
    public static void main (String args[]){
        IeltsConvert myL = new IeltsConvert();
        List<englishCerScore> myC = myL.getAllConvertScore(Double.valueOf(3.5));
        if(myC.size()==0){
            System.out.println("Cant found");
        } else{
        for (int i = 0; i< myC.size(); i++){
            System.out.println(myC.get(i).toString());
        }
        }
    }
}
