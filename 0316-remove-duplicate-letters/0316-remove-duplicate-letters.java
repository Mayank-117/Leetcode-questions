import java.util.Stack;

class Solution {
    public String removeDuplicateLetters(String s) {

        // Stores the last occurrence of each character
        int[] last = new int[26];

        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        // Keeps track of whether a character is already in the stack
        boolean[] visited = new boolean[26];

        // Stack to build the answer
        Stack<Character> stack = new Stack<>();

        // Traverse the string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Skip if already present in the stack
            if (visited[ch - 'a']) {
                continue;
            }

            // Remove larger characters if:
            // 1. Stack is not empty
            // 2. Current character is smaller
            // 3. The top character appears again later
            while (!stack.isEmpty()
                    && ch < stack.peek()
                    && last[stack.peek() - 'a'] > i) {

                visited[stack.pop() - 'a'] = false;
            }

            // Add current character
            stack.push(ch);
            visited[ch - 'a'] = true;
        }

        // Convert stack to string
        StringBuilder ans = new StringBuilder();

        for (char c : stack) {
            ans.append(c);
        }

        return ans.toString();
    }
}