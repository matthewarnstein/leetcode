class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> a = new ArrayDeque<Character>();
        
        
        for (int i = 0; i < s.length(); i++) {
            if (!processParen(s.charAt(i), a)) {
                return false;
            }
        }
        if (a.isEmpty()) {
            return true;    
        } else {
            return false;
        }

    }
    
    
    public static boolean processParen(Character p, ArrayDeque<Character> a) {
        if (p == '(') {
            a.push(p);
            return true;
        } else if (p == ')') {
            if (!a.isEmpty() && a.peek() == '(') {
                a.pop();
                return true;
            } else {
                return false;
            }
        } else if (p == '{') {
            a.push(p);
            return true;
        } else if (p == '}') {
            if (!a.isEmpty() && a.peek() == '{') {
                a.pop();
                return true;
            } else {
                return false;
            }
        } else if (p == '[') {
            a.push(p);
            return true;
        } else if (p == ']') {
            if (!a.isEmpty() && a.peek() == '[') {
                a.pop();
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
        
    }
    
    public static void printParen(Character p, ArrayDeque<Character> a) {
        while (!a.isEmpty()) {
            System.out.print(a.pop() + " ");
        }
        System.out.println();
    }
}
