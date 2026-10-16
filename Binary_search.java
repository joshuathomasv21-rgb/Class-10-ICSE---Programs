import java.util.Scanner;
public class Binary_search
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int A[] = {9,15,20,21,30,34,40,66,67,69,69,100,1004,1005,1204,1505};
        System.out.println("Enter number to be searched: ");
        int x =sc.nextInt();
        int beg = 0, end = A.length -1;
        while(beg<=end)
        {
            int mid = (beg + end)/2;
            if(x==A[mid])
            {
                System.out.println("Search successful at index: "+mid);
                System.exit(0);
            }
            else if(x<A[mid])// change the sign if it is a descnding array
                end = mid -1;
            else
                beg = mid +1;
        }
        System.out.println("Search unsuccessful");
    }
}
