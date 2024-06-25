public class StringSplit {

    public String[] stringSplit(String s) {

        if (s.length() % 2 != 0) {
            s += "_";
        }

        String[] splitString = new String[s.length() / 2];

        for (int i = 0; i < s.length(); i += 2) {
            splitString[i / 2] = s.substring(i, i + 2);
        }

        return splitString;
    }
}
