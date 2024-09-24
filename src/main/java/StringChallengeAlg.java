//. Have the function StringChallange(str) take the str parameter being passed and return a
// compressed version of the string using the Run-length encoding algorithm. This algorithm works by
// taking the occurrence of each repeating character and outputting that number along with a single
// character of the repeating sequence. For example: "wwwggopp" would return 3w2g1o2p. The string will
// not contain any numbers, punctuation, or symbols. Example: Input: "aabbcde" Output: 2a2b1c1d1e
// Example: Input: "wwwbbbw" Output: 3w3b1w Example: Input: "wwwggopp" Output: 3w2g1o2p
//


public class StringChallengeAlg {
    /**
     *
     * @param str the input string to be encoded
     * @return a run lenght encoded string
     * @throws IllegalArgumentException if the input data string is null or empty
     */

    public static String stringChallange(String str) {
        if(str == null || str.isEmpty()) {
            throw new IllegalStateException("Empty or null is not allowed");
        }
        int n = 0;
        int counter = 1;
        StringBuilder result = new StringBuilder();

        while (n < str.length() - 1) {

            if (str.charAt(n) == str.charAt(n + 1)) {
                ++counter;
                n++;

            } else {

                result = result.append(counter).append(str.charAt(n++));
                counter = 1;
            }
        }
        result = result.append(counter).append(str.charAt(n));
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(stringChallange("wwwbbbw"));
        System.out.println(stringChallange(null));
        System.out.println(stringChallange(""));
    }
}
