import java.util.Scanner;
public class Linear_Search
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many cells? ");
        int n=sc.nextInt();
        int A[] = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter a number: ");
            A[i] = sc.nextInt();
        }
        System.out.println("Which number to be searched: ");
        int x=sc.nextInt();
        int c = 0;
        for(int i =0; i<n; i++)
        {
            if(x==A[i])
            {
                System.out.println("Search successful at index: "+i);
                ++c;
            }
        }
        if(c ==0)
            System.out.println("Search unsuccessful");
        else
            System.out.println("Count is: "+c);
    }
}
