package practicsEx;

import java.util.HashMap;
import java.util.Map;

//Подсчет повторяющихся символов
public class CountingRepeatedCharacters {
    public Map<Character, Integer> countDuplicateCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();

//        public MapClass<Character, Long> countDuplicateCharacters(String str) {
//            MapClass<Character, Long> result = str.chars()
//                    .mapToObj(c -> (char) c)
//                    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//            return result;
//        }

//через for
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }

}



