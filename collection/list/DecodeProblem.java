package collection.list;

import java.util.Stack;

public class DecodeProblem {
    public static void main(String[] args) {
//        String s = "2[ab2[c]]"; // abccabcc
        String s = "2[ab3[c2[d]]e]"; // abcddcddcddeabcddcddcdde
        Stack<Integer> count = new Stack<>();
        Stack<StringBuilder> subStr = new Stack<>();
        StringBuilder current = new StringBuilder();
        int num = 0;
        for (Character c: s.toCharArray()) {
            if(Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            else if (c == '[') {
                count.push(num);
                subStr.push(current);
                num = 0;
                current = new StringBuilder();
            }
            else if (c == ']') {
                int repeat = count.pop();
                StringBuilder temp = current;
                current = subStr.pop();
                while(repeat -- > 0)
                    current.append(temp);
            }
            else
                current.append(c);
        }

        System.out.println(current);
    }
}
