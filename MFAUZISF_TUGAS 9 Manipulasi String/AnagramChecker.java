import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String kata1 = "listen";
        String kata2 = "silent";

        if(areAnagrams(kata1, kata2)) {
            System.out.println(kata1 + "dan"+ kata2 + "adalah Anagram.");
        }else{
            System.out.println(kata1 + " dan " + kata2 + " bukan Anagram.");

          

    }
}
    public static boolean areAnagrams(String str1, String str2){
    
        char[] a = str1.replaceAll("\\s","").toLowerCase().toCharArray();
        char[] b = str2.replaceAll("\\s","").toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);

    }
    
}

