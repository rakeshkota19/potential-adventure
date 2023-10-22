package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LC49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();


        for(String str: strs) {
            char[] tmp = str.toCharArray();
            String tmpStr = new String(tmp);

            if (!m.containsKey(tmpStr)) {
                List<String> l = new ArrayList<>();
                l.add(str);
                m.put(tmpStr, l);
            } else {
                m.get(tmpStr).add(str);
            }
        }

        return new ArrayList<>(m.values());
    }
}
