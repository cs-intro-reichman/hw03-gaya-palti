/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }
    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch == ' '){
                ans = ans + " ";
            } else if (ans.indexOf(ch) == -1){
                ans = ans + ch;
            }
        }
        return ans;
    }   
}

//check with indexof on the new string slide 32
