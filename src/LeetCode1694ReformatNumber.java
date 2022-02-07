public class LeetCode1694ReformatNumber {
    public static void main(String[] args) {
        System.out.println(reformatNumber("1-23-45 6"));
        System.out.println(reformatNumber("123 4-567"));
        System.out.println(reformatNumber("123 4-5678"));
    }

    public static String reformatNumber(String number) {
        StringBuilder preProcess = new StringBuilder();
        for (char c : number.toCharArray()) {
            if (c != ' ' && c != '-') {
                preProcess.append(c);
            }
        }
        if (preProcess.length() <= 3) {
            return preProcess.toString();
        }
        String pre = preProcess.toString();
        StringBuilder ans = new StringBuilder();
        if (pre.length() == 4) {
            return ans.append(pre.charAt(0)).append(pre.charAt(1)).append('-').append(pre.charAt(2)).append(pre.charAt(3)).toString();
        }
        for (int i = 0; i < pre.length(); i++) {
            ans.append(pre.charAt(i));
            ans.append(pre.charAt(i + 1));
            ans.append(pre.charAt(i + 2));
            ans.append('-');
            i += 2;
            if (pre.length() - i == 5) {
                ans.append(pre.charAt(i + 1));
                ans.append(pre.charAt(i + 2));
                ans.append('-');
                ans.append(pre.charAt(i + 3));
                ans.append(pre.charAt(i + 4));
                return ans.toString();
            }
            if (pre.length() - i == 4) {
                ans.append(pre.charAt(i + 1));
                ans.append(pre.charAt(i + 2));
                ans.append(pre.charAt(i + 3));
                return ans.toString();
            }
            if (pre.length() - i == 3) {
                ans.append(pre.charAt(i + 1));
                ans.append(pre.charAt(i + 2));
                return ans.toString();
            }
        }
        return ans.toString();
    }
}
