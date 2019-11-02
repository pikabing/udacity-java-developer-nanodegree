class NumToString {

    private static final String[] LESS_THAN_20 =
            {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                    "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                    "seventeen", "eighteen", "nineteen"};
    private static final String[] TENS = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String[] THOUSANDS = {"", "thousand", "million", "billion"};

    public static String translateNumberToWord(int number) {
        String word = "";
        if(number == 0)
            return "zero";
        int i = 0;
        while(number > 0) {

            if(number % 1000 != 0) {
                word = helper(number%1000) + " " + THOUSANDS[i] + " " + word;
            }

            number = number / 1000;
            i++;
        } 
        return word; 
    }

    public static String helper(int number) {
        if(number == 0)
            return "";
        if(number < 20)
            return LESS_THAN_20[number];
        else if(number < 100)
            return TENS[number/10] + " " + helper(number%10);
        else
            return LESS_THAN_20[number/100] + " hundred " + helper(number%100);
    }
        
    public static void main(String[] args) {
        System.out.println(translateNumberToWord(Integer.parseInt(args[0])));
    }
}