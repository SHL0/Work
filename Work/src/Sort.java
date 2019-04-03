
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Sort {
	
	public void sortwords(Map<String, Integer> Map){  
        File file = new File("src/result.txt");
        Set<Entry<String,Integer>> mapEntries = Map.entrySet();    
        LinkedList<Entry<String, Integer>> List = new LinkedList<Entry<String,Integer>>(mapEntries);
           Collections.sort(List, new Comparator<Entry<String,Integer>>() {  
            @Override  
            public int compare(Entry<String, Integer> ele1,  Entry<String, Integer> ele2) {
                return ele1.getKey().compareTo(ele2.getKey()); 
            }  
        }); 
       
        HashMap<String,Integer> Map2 = new LinkedHashMap<String, Integer>();  
        for(Entry<String,Integer> entry: List) {  
            Map2.put(entry.getKey(), entry.getValue());  
        }  

        try {
        	if(file.exists()) {
        		file.createNewFile();
        	}
        	FileWriter writer = new FileWriter(file.getAbsoluteFile());
        	for(Entry<String,Integer> e : Map2.entrySet()) {
        		writer.write(e.getKey()+":\t"+e.getValue()+"\n");
        	}
        	writer.close();
        	System.out.println("存储结束！可以在文件中查看");
        }catch(IOException e) {e.printStackTrace();
        }
	} 
}
