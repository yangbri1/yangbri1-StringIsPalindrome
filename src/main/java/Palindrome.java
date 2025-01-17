
public class Palindrome {
    /**
     * Palindromes are words that are the same forwards as they are backwards - eg, 'bob', 'racecar'.
     *
     * You can solve this problem in several ways:
     * You could start with a String reversal algorithm, which you have already written, and check if str is the same
     * as its reversed form, or, you could check if the character at the nth position of a String moving forwards
     * re the same as the nth position of a String moving backwards.
     *
     * @param str A String.
     * @return true if str is a palindrome, false otherwise.
     */
    public boolean pal(String str){
        // initialize an empty String to append char of 'str' in reverse order
        String reverseString = "";

        // assign iterator 'i' to this value in order to decrement
        int i = str.length() - 1;
        // loop through str in descending fashion
        while(i >= 0){
            // reverseString += char[i];    -- works for char[]
            // append each char from right to left
            reverseString += str.charAt(i);
            // (prefix) decrement to allow loop to continue
            --i;
        }
        
        // apply .equals() to loosely compare the value of 'str' to value of 'reverseString' 
        // use .equals() over equality operator (==) when dealing with String (complex Object types -- memory location possibly different in Heap)
        // if(str.equals(reverseString)){
        //     // return true if equal
        //     return true;
        // }
        // // otherwise return false
        // return false;

        // aside: ternary operator way equivalent to above if-else 
        return(str.equals(reverseString) ? true : false);
    }
}
