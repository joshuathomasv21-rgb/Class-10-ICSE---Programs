public class Passbyreference
{
    public static void add(int b[])
    {
        int p =b.length;
        for(int i =0; i<p; i++)
        b[i]+=2;
        System.out.println("Change:");
        for(int i =0; i<p; i++)
        System.out.print(b[i]);
        System.out.println();
    }
    public static void main(String [] args)
    {
        int a[]= {2,3,4,5,6,7,8,9,10};
        add(a);
        System.out.println("Original: ");
        for( int i=0; i<a.length; i++)
        System.out.print(a[i]);
    }
}