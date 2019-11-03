import java.util.*;

class LargestNumber {

    public static ArrayList<Integer> firstKNumbers(List<Integer> arr, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Collections.sort(arr);
        int len = arr.size();
        for(int i =len-k; i<len; i++) {
            res.add(arr.get(i));
        }
        return res;
    }
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(5, 10, 22, 100, 8);
        System.out.println(firstKNumbers(input, 4));
    }
}