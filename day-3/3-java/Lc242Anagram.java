// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:
// Input: s = "rat", t = "car"
// Output: false
import java.util.Arrays;
class Lc242Anagram{
    public static boolean Isanagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        char [] sarr=s.toCharArray();
        char [] tarr=t.toCharArray();

        Arrays.sort(sarr);
        Arrays.sort(tarr);
        return Arrays.equals(sarr, tarr);
    }
    

    public static void main(String[] args){
        String s="anagram";
        String t="nagaram";
        if(Isanagram(s,t)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}