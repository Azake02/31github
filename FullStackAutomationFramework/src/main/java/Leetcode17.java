public class Leetcode17 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String arr[] = s.split(" ");
        String sortedArr[] = new String[arr.length];

        for (String word : arr) {
            int index = word.charAt(word.length() - 1) - '0';
            sortedArr[index - 1] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", sortedArr);
    }
}
