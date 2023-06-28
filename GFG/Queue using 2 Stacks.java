class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   // Your code here
	   if(s1.isEmpty()){
       while(!s2.isEmpty())
           s1.push(s2.pop());
        }
        s1.push(x);
        while(!s1.isEmpty())
            s2.push(s1.pop());
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   // Your code here
	   if(s2.isEmpty())
       return -1;
       return(s2.pop());
    }
}
