
/**
 * Just a piece of code that runs Word()
 *
 * @author LminusSucksAtCoding
 * @version 2021-11-12
 */

import java.util.Scanner;
public class WordRunner
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        Word lab = new Word();
        
        String input = keyboard.nextLine();
        lab.inputWord(input);
        System.out.println("See you next time!");
    }
}
