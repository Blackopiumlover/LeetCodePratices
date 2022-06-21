public class LeetCode1108DefangIPaddr {
    public static void main(String[] args) {
        System.out.println(dafangIPaddr("1.1.1.1"));
    }

    public static String dafangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
