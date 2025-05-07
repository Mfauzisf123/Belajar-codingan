import java.util.HashMap;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String input = "successes";
        HashMap<Character, Integer> map = new HashMap<>();
        char mostFreq = ' ';
        int max = 0;

        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) > max) {
                max = map.get(c);
                mostFreq = c;
            }
        }

        System.out.println("Karakter paling sering: " + mostFreq + " (" + max + " kali)");
    }
}
