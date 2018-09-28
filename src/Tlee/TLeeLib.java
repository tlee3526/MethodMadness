/**Travis Lee 9/21/2018
 *
 */
package Tlee;

class TleeLib
{
    public static void println(String str)
    {
        System.out.println(str);
    }

    /**
     * I changed the mm-dd-yyyy to dd--mm-yyyy.
     * @param date This is the date I'n trying to change.
     * @return I'm returning the date in a new order.
     */
    public static String dateStr(String date)
    {
        return (date.substring(3, 5) + "-" + date.substring(0, 2) + "-" + date.substring(6, 10));
    }

    /**
     *This finds multiples of 5 and/or 3.
     * @param num1 It becomes a number to check and is checked to see if it is a multiple of 5 and/or 3.
     */
    public static void fooBarBaz(int num1)
    {
        for (int i = 0; i < num1; i++)
        {
            if (i % 5 == 0 && i % 3 == 0)
            {
                System.out.println("baz");
            }
            else if (i % 5 == 0)
            {
                System.out.println("bar");
            }
            else if (i % 3 == 0)
            {
                System.out.println("foo");
            }
            else
            {
                System.out.println(i);
            }
        }
    }

    /**
     * This shows if the number is part of the fibonnaci sequence by returning true.
     * @param num The number which the function is checking whether is it part of the fibonnaci sequence.
     * @return It returns false when the number isn't part of the fibonnaci sequence.
     */
    public static Boolean isFibonnaci(int num) {
        int begin = 0;
        int add = 1;
        int equal = 0;
        while (equal < num)
        {
            equal = begin + add;
            begin = add;
            add = equal;
        }
        if (equal != num)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * This is where you add up every number starting from zero to the number you input.
     * @param num This is the number that you must add up to from zero.
     * @return This returns the sum of all the numbers.
     */
    public static Integer sumUpTo(int num) {
        int sum = 0;
        for (int i = num; i >= 0; i-- )
        {
            sum+= i;
        }
        return sum;
    }

    /**
     * This checks if the word is a palindrome.
     * @param word This is the word I am testing.
     * @return This returns whether the word is a palindrome.
     */
    public static boolean isPalindrome(String word) {
        String word1 = word.toLowerCase();
        int num = word.length() - 1;
        String word2 = "";
        for (int i = num; i >= 0; i--) {
            String part = word1.substring(i, i + 1);
            word2 += part;
        }
        return (word1.equals(word));
    }
}