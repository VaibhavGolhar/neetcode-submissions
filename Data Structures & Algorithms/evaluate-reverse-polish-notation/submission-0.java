class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens){
            switch(s){
                case "+":{
                    int op1 = stack.pop();
                    int op2 = stack.pop();

                    int res = op2 + op1;
                    stack.push(res);
                    break;
                }
                case "-":{
                    int op1 = stack.pop();
                    int op2 = stack.pop();

                    int res = op2 - op1;
                    stack.push(res);
                    break;
                }
                case "*":{
                    int op1 = stack.pop();
                    int op2 = stack.pop();

                    int res = op2 * op1;
                    stack.push(res);
                    break;
                }
                case "/":{
                    int op1 = stack.pop();
                    int op2 = stack.pop();

                    int res = op2 / op1;
                    stack.push(res);
                    break;
                }
                default:{
                    stack.push(Integer.parseInt(s));
                }
            }
        }

        return stack.pop();
    }
}