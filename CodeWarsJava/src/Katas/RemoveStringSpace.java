public class RemoveStringSpace {

    public String noSpace(String string) {

        return string.replaceAll("\\s{1,}", "").strip();
    }
}
