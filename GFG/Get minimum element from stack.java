class GfG
{
    int minEle;
    Stack<Integer> s;
      Stack<Integer> s2=new Stack<>();
    // Constructor    
    GfG()
	{
        s=new Stack<>();
	}
	
    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	 if(s2.isEmpty())
        return -1;
    return s2.peek();
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	if(s.isEmpty()) return -1;
	int val=s.pop();
    if(val==s2.peek())
        s2.pop();
    return val;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here
	if(s2.isEmpty() || x<=s2.peek())
            s2.push(x);
    s.push(x);
    }	
}
