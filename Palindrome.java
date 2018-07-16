package Palin;

public class Palindrome
{

    public boolean isPalinHelper(int x, int digits)
    {

    }

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
            int amountOfDigits = numOfDigits(x);
            int lastDigit = x % 10;
            int divided = x / 10;
            isPalindrome(divided);
        }

        return true;

    }

    public int numOfDigits(int x)
    {
        if (x < 10 && x > 0)
        {
            return 1;
        }
        else
        {
            return 1 + numOfDigits(x / 10);
        }
    }


}

class PalinTesters
{
    public static void main(String[] argsgsg)
    {
        Palindrome palin = new Palindrome();

        int blah = palin.numOfDigits(93898);
    }
}
