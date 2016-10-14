
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
 
public class SortHashMap {
 
    public static void main(String[] args) {
        
        HashMap<String, String> map = new HashMap<String,String>();
        
            map.put("item1", "Double Cheese Margherita");
            map.put("item2", "Country Special");
            map.put("item3", "Farm House");
            map.put("item4", "Spicy Triple Tango");
            map.put("item5", "Veg Hawaiian Delight");
            map.put("item6", "Peppy Paneer Double Cheese Margherita");
            map.put("item7", "Mexican Green Wave");
            map.put("item8", "Deluxe Veggie");
            map.put("item9", "5 Pepper");
            map.put("item10", "Veggie Paradise");
            
            System.out.println("====================");
            System.out.println("Before sorting ");
            System.out.println("====================");
            
            for(Map.Entry<String, String> m:map.entrySet()){
                 
                 System.out.println(m.getValue());
             }
                        
            HashMap<String, String> sortedMap= sortByValue(map);
            
            System.out.println("====================");
            System.out.println("After sorting");
            System.out.println("====================");
             
             for(Map.Entry<String, String> m:sortedMap.entrySet()){
                 
                 System.out.println(m.getValue());
             }
             
            
            
        
    }
    
  public static HashMap<String, String> sortByValue(HashMap<String, String> map) {
List<Map.Entry<String, String>> list = new LinkedList<Map.Entry<String,
                                               String>>(map.entrySet());
 
Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
 
    @Override
    public int compare(Map.Entry<String, String> value1, Map.Entry<String, String> value2) {
    return (value1.getValue()).compareTo(value2.getValue());
    }
});
 
HashMap<String, String> result = new LinkedHashMap<String, String>(); //Linked hash map preserves the order
for (Map.Entry<String, String> entry : list) {
    result.put(entry.getKey(), entry.getValue());
}
return result;
}
 
}