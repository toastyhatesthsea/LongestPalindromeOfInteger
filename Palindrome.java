package Palin;

public class Palindrome
{

    public boolean isPalinHelper(int x, int digits)
    {
        if (digits <= 1)
        {
            return true;
        }
        else
        {
            int divider = (int) (Math.pow(10, digits - 1));
            int firstDigit = x / divider;
            int lastDigit = x % 10;

            if (firstDigit != lastDigit)
            {
                return false;
            }
            else
            {
                x = (x - (divider * firstDigit));
                return isPalinHelper(x / 10, digits - 2);
            }
        }
    }

    public boolean isPalindrome(int x)
    {
        if (x < 0)
        {
            return false;
        } else if (x == 0)
        {
            return true;
        } else if (x < 10)
        {
            return true;
        } else
        {
            int amountOfDigits = numOfDigits(x);
            return isPalinHelper(x, amountOfDigits);
        }
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

        boolean blah = palin.isPalindrome(1321);
    }
}
