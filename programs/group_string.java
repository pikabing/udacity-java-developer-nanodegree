import java.util.*;

class GroupString {

    public static List<List<String>> groupString(List<String> input) {
        
        List<List<String>> stringArray = new ArrayList<>();
        List<String> aList = new ArrayList<>();
        List<String> bList = new ArrayList<>();
        List<String> restList = new ArrayList<>();

        for(String string : input) {

            char first = string.charAt(0);

            switch(first) {
                case 'a':
                    aList.add(string);
                    break;

                case 'b':
                    bList.add(string);
                    break;

                default:
                    restList.add(string);
                    break;
            }
        }

        stringArray.add(aList);
        stringArray.add(bList);
        stringArray.add(restList);
        return stringArray;
    }

    public static void main(String[] args) {

        List<String> input = Arrays.asList("abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbbb", "eeee");
        List<List<String>> ans = groupString(input);
        for(List<String> list : ans) {

            for(String s : list) {
                System.out.print(s + " ");
            }

            System.out.println();
        }
            
        }
    }
