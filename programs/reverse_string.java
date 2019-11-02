class Reverse {

    public static String reverseString(String s) {
        StringBuilder reverse = new StringBuilder(s.length());

        for(int i = s.length()-1; i >=0; i--) {
            reverse.append(s.charAt(i));
        }

        return reverse.toString();
    }
        
    public static void main(String[] args) {
        System.out.println(reverseString("Hello World!"));
        System.out.println(reverseString("Pratik Gupta"));

    }
}