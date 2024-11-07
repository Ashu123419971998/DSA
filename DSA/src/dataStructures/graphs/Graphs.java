package dataStructures.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graphs {
    private HashMap<String, ArrayList<String>> map= new HashMap<>();

   public boolean addVertex(String value)
   {
       if(map.get(value)==null) {
           map.put(value, new ArrayList<String>());
           return true;
       }
       return false;
   }
    public boolean addEdge(String value1, String value2)
    {
        if(map.get(value1)!=null && map.get(value2)!=null) {
            map.get(value1).add(value2);
            map.get(value2).add(value1);
            return true;
        }
        return false;
    }
    public boolean removeEdge(String value1, String value2)
    {
        if(map.get(value1)!=null && map.get(value2)!=null) {
            map.get(value1).remove(value2);
            map.get(value2).remove(value1);
            return true;
        }
        return false;
    }
    public boolean removeVertex(String value)
    {
        if(map.get(value)!=null) {
            for (String key : map.keySet()) {
                map.get(key).remove(value);
            }
            map.remove(value);
            return true;
        }
        return false;
    }
    public void print()
    {
        System.out.println(map);

    }
}
