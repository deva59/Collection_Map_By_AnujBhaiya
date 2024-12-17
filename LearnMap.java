package Collection_Map_By_AnujBhaiya;

import java.util.*;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();

        //Duplicate Keys Not Allow
        //Order is Not Preserved

        Map<String, String> map = new HashMap<>();

        map.put("us","United States");
        map.put("In", "India");
        map.put("in", "India");

        //map.entrySet Return- Entry Set[Entry means Class create all Map]
        Set<Map.Entry<String,String>> entries = map.entrySet();

        //Both Key And Values Travels
        for(Map.Entry<String,String>entry:entries){
            System.out.println(entry.getKey()+" , "+entry.getValue());
        }


        //Only Keys get return
      //  Set<String> keys = map.keySet();
     //   System.out.println(keys);

        //Collection of String - not a Set of String
       // Collection<String>values =  map.values();
      //  System.out.println(values);




        //jar map madil key chi value same nasel ter remove honar nahi jar same asel terch remove hoil.
//        map.remove("in") //remove(K).
//        map.remove("in","India"); //remove(K,V).
//       System.out.println(map);

      //  System.out.println(map.containsKey("in"));

        //Element is Not present Return Null If Present Return Value
       // System.out.println(map.putIfAbsent("in", "India"));

        //Perticular Element Search Using Key.
//        System.out.println(map.get("pn"));

//        System.out.println("Contains value "+map.containsValue("India"));

//        System.out.println(map.getOrDefault("pn","Ohters"));

     //   Map<String,String> map2 = new HashMap<>();

     //   map2.putAll(map);//map object ka pura data map2 ke under insert ker dala.
     //   System.out.println(map2);


    }
}
