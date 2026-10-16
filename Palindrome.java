import java.util.Scanner;
public class Palindrome
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s =sc.nextLine();
        String rev ="";
        int l =s.length();
        for(int i =0; i<l ; ++i)
        {
            char ch =s.charAt(i);
            rev = ch+rev;
        }
        if(rev.equalsIgnoreCase(s))
            System.out.println("It's a palindrome");
        else
        System.out.println("Not a palindrome");
    }
}
