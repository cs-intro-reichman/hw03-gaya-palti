/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String str) {
        int i = 0;
        String ans = "";
        while (i < str.length()){
            char ch = str.charAt(i);
            if (ch <= 90 && ch >= 65){
                ans = ans + (char) (str.charAt(i) + 32);
            } else if (ch == ' '){
                ans = ans + " ";
            }
            else {
                ans = ans + (char) ch;
            }
            i++;
        }
        return ans;
    }
}


