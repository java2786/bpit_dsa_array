import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sortedStr = String.valueOf(arr);
            // System.out.println(sortedStr);

            if(!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());
            }

            map.get(sortedStr).add(str);
        }
        // System.out.println(map.values());
        return new ArrayList<>(map.values());   
    }
}
public class Demo_5 {
    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        List<List<String>> result = ga.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});

        // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        System.out.println(result);
    }    
}
