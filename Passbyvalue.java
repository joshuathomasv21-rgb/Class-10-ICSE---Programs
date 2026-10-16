public class Passbyvalue
{
    public static void main(String [] args)
    {
        
        int a = 1;
        int b = 3;
        noshow(a,b);
        System.out.println("Actual parameters: "+a+", "+b);
    }
    public static void noshow(int x, int y)
    {
        x = x+2;
        y = y+2;
        System.out.println("Formal parameters: "+x+", "+y);
    }
    
}