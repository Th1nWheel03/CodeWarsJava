public class CamelCase {

    public String camelCase(String str) {
        
        if (str == null || str.isEmpty()) {
            return "";
        }

        str = str.toLowerCase().replaceAll("\\s{2,}", " ").strip();

        String[] words = str.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
            }
        }

        return sb.toString();
    }
}
