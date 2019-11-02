import java.util.Stack;

class Calculator {
    
    public static int calculate(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        int num = 0;
        char sign = '+';
        for(int i =0; i< s.length(); i++) {
            char p = s.charAt(i);
            if(Character.isDigit(p)) {
                num = num*10 + Character.getNumericValue(p);
            }

            if(!Character.isDigit(p) || i==s.length()-1) {
                if(sign == '+'){
                    stack.push(num);
                } 
                if(sign == '-') {
                    stack.push(-num);
                }
                if(sign == '*') {
                    stack.push(stack.pop() * num);
                }
                sign = p;
                num = 0;
            }
        }
        for (int i : stack) {
            ans += i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(calculate("1-2*5+5")); 
    }

}

