package TrickyInterviewQuestions;

class OverrideStaticMethodPossible1 
{
    public static void display()
    {
        System.out.println("Welcome to Parent Class");
    }
}
public class OverrideStaticMethodPossible extends OverrideStaticMethodPossible1
{
    public static void display()
    {
        System.out.println("Welcome to Child class");
    }
    public static void main(String args[]) 
    {
        //Assign Child class object to Parent reference
    	OverrideStaticMethodPossible1  pc = new OverrideStaticMethodPossible();
    	
        pc.display();
     }
}