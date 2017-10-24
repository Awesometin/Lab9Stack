public class stackX {
	private int maxSize;
	private char[] stackArray;
	private int top;
	

	
	public stackX(int s) //constructor
	{
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char j)//put item on top of stack
	{
		//stackArray[++top] = j;
		this.stackArray[++top] = j;
	
	}
	
	public char pop(){
		return stackArray[top--];
	}
	
	public char peek(){
		return stackArray[top];
	}
	
	public  boolean isEmpty(){
		return (top == -1);
	}
	
		
	public boolean DelemiterChecker( String inpEx)
	{
		int stackSize = inpEx.length();
		stackX theStack = new stackX(stackSize);
		for ( int i = 0; i < inpEx.length(); i++)
		{
			char ch = inpEx.charAt(i);
			switch (ch) {
			case '{':
			case '[':
			case '(':
				theStack.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				if (!theStack.isEmpty())
				{
					char stackCont = theStack.pop();
				if ((ch == '}' && stackCont != '{') 
					|| (ch == ']' && stackCont != '[') 
					|| (ch == ')' && stackCont != '('))
				{
				System.out.println("Mismatching delimiter found: " + ch + " at " + i);
				return false;
				}
			} else {
				System.out.println("Mismatching delimiter found: " + ch + " at " + i);
				return false;
			}
			break;
			default: break;
		}
	}
	if (!theStack.isEmpty())
	{
		System.out.println("Error: missing delimiter");
		return false;
	}
	return true;
}

	
	public boolean delimiterCheckerTester()
	{
		stackX test = new stackX(maxSize);
	//	assertEquals(test.check)), true);
		return true;
	}
	
	}
	
	
	

