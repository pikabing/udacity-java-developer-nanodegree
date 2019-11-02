import java.util.*;

class Frequency {

    static Map<String, Integer> calFrequency(List<String> input) {

        Map<String, Integer> res = new HashMap<String, Integer>();
        for(String s: input) {
            if(res.containsKey(s)){
                res.compute(s, (key, val) -> val = val + 1);
            } else {
                res.put(s, 1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        List<String> input = Arrays.asList("abc", "bcd", "abc","jkf","jkf","jkf","bcd","aa","qq");
        Map<String, Integer> res = calFrequency(input);
        for(Map.Entry<String, Integer> entry: res.entrySet()) {
            System.out.println(entry.getKey()+ " | " + entry.getValue());
        }
    }
}