public class LengthOfLastWord_58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String b[] = s.split("\\s+");
        return b[b.length - 1].length();
    }
}
