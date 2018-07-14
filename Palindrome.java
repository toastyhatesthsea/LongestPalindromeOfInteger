package Palin;

public class Palindrome
{

    public boolean isPalindrome(int x)
    {
        if (x < 1)
        {
            return false;
        } else if (x < 10)
        {
            return true;
        }
        else
        {
            int firstDigit = x % 10;
        }

        return true;

    }


}

class PalinTesters
{
    public static void main(String[] argsgsg)
    {
        Palindrome palin = new Palindrome();

        palin.isPalindrome(121);
    }
}
