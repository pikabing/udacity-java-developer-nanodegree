import java.util.*;

class FirstDuplicate {

    public static int findDuplicate(String input) {

        int duplicate = -1;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i =0; i<input.length(); i++) {

            char p = input.charAt(i);
            if(map.containsKey(p))
                return i;
            else 
                map.put(p, 1);

        }
        return duplicate;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate("abcuewqdv"));
    }
}