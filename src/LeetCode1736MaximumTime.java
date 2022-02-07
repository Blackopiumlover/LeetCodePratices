public class LeetCode1736MaximumTime {
    public static void main(String[] args) {
        System.out.println(maximumTime("2?:?0"));
        System.out.println(maximumTime("0?:3?"));
        System.out.println(maximumTime("1?:22"));
        System.out.println(maximumTime("??:3?"));
        System.out.println(maximumTime("?4:03"));
    }
    public static String maximumTime(String time) {
        StringBuilder sb = new StringBuilder();
        if (time.charAt(0) == '?' && time.charAt(1) == '?') {
            sb.append('2');
        } else if (time.charAt(0) == '?' && time.charAt(1) < '4') {
            sb.append('2');
        } else if (time.charAt(0) == '?' && time.charAt(1) >= 4) {
            sb.append('1');
        } else {
            sb.append(time.charAt(0));
        }
        if ((sb.charAt(0) == '0' || sb.charAt(0) == '1') && time.charAt(1) == '?') {
            sb.append('9');
        } else if (sb.charAt(0) == '2' && time.charAt(1) == '?') {
            sb.append('3');
        } else {
            sb.append(time.charAt(1));
        }
        sb.append(':');
        if (time.charAt(3) == '?') {
            sb.append('5');
        } else {
            sb.append(time.charAt(3));
        }
        if (time.charAt(4) == '?') {
            sb.append('9');
        } else {
            sb.append(time.charAt(4));
        }
        return sb.toString();
    }
}
