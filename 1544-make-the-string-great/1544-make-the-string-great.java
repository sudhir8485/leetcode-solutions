class Solution {
    public String makeGood(String s) {
        
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(stack.isEmpty()){
                stack.push(ch);
            } 
            else{
                char ch2 = stack.peek();

                if(ch==(ch2-32) || ch==(ch2+32)){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
        }

        String op = "";

        while(!stack.isEmpty()){
            op = stack.pop() + op;
        }

        return op;
    }
}