
//Have the function StringChallange(str) take the str parameter being passed which will
// be two times (each properly formatted with a colon and am or pm) separated by a hyphen
// and return the total number of minutes between the two times. The time will be in a 12
// hour clock format. For example: if str is 9:00am-10:00am then the output should be 60.
// If str is 1:00pm - 11:00am the output should be 1320. Example: Input: "12:30pm-12:00am"
// Output: 690 Example: Input: "1:23am-1:08am" Output: 1425 Example: Input: "9:00am-10:00am" Output: 60 Example: Input: "1:00pm-11:00am" Output: 1320
//

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class StringChallenge {

    /**
     * @param str the input string to be encoded
     * @return a string representing the total number of minutes between the two times
     * @throws IllegalArgumentException if the input data string is null or empty
     */

    public static String stringChallange(String str) throws ParseException {

        if (str == null || str.isEmpty()) {
            throw new IllegalStateException("Empty or null is not allowed");
        }

        String[] arr = str.split("-");
        String t1 = arr[0];
        String t2 = arr[1];

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mma");
        Date date1 = simpleDateFormat.parse(t1);
        Date date2 = simpleDateFormat.parse(t2);

        long timeDiff = date2.getTime() / 60000 - date1.getTime() / 60000;
        return String.valueOf(date2.before(date1) ? timeDiff + 60 * 24 : timeDiff);
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(stringChallange("12:30pm-12:00am"));
        System.out.println(stringChallange("1:23am-1:08am"));
        System.out.println(stringChallange(" 9:00am-10:00am"));
    }
}

