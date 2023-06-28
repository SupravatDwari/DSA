class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> s=new Stack<>();
        int n=x.length();
        for(int i=0;i<n;i++){
            char c=x.charAt(i);
            if(isOpening(c))
                s.push(c);
            else {
                if (s.isEmpty())
                    return false;
                else if (!isValid(s.peek(), c))
                    return false;
                else
                    s.pop();
            }
        }
        return s.isEmpty();
    }

    static boolean isOpening(char a) {
        return (a == '(' || a == '{' || a == '[');
    }

    static boolean isValid(char a, char b) {
        return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
    }
}
