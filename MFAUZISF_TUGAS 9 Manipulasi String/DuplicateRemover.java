public class DuplicateRemover {
    public static void main(String[] args) {
        String input = "programming";
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // ASCII

        for (char c : input.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }

        System.out.println("Setelah duplikat dihapus: " + result);
    }
}
