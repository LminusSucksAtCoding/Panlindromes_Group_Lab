
/**
 * Does the dirty work of:
 * checking if it's a Palindrome and telling the user so.
 *
 * @author LminusSucksAtCoding
 * @version 2021-11-12
 */
public class Word
{
    // instance variables - replace the example below with your own
    private String word;
    private String wordInverted;
    /**
     * Constructor for objects of class Word
     */
    public Word()
    {
       System.out.print("Welcome!  Please Enter a Word :: ");
    }
    public void inputWord(String input)
    {
        word = input;
        System.out.println(reverse());
        System.out.print(word);
        isPalindrome();
    }
    public String reverse()
    {
        wordInverted = "";
        for (int i = word.length() - 1; i >= 0; i--)
        {
            wordInverted += word.substring(i,i+1);
        }
        return (wordInverted);
    }
    public void isPalindrome()
    {
        String lowerWord = word.toLowerCase();
        String lowerWordInverted = wordInverted.toLowerCase();
        
        Boolean palindrome = lowerWord.equals(lowerWordInverted);
        if (palindrome)
            System.out.println(" is a palindrome.");
        else
            System.out.println(" is not a palindrome.");
    }
}
