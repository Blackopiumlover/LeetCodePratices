public class LeetCode1507ReformatData {
    public static void main(String[] args) {
        System.out.println(reformatData("20th Oct 2052"));
        System.out.println(reformatData("6th Jun 1933"));
        System.out.println(reformatData("26th May 1960"));
    }

    public static String reformatData(String date) {
        StringBuilder sb = new StringBuilder();
        String[] preProcess = date.split(" ");
        String year = preProcess[2];
        String month = preProcess[1];
        if (month.startsWith("Ja")) {
            month = "01";
        } else if (month.charAt(0) == 'F') {
            month = "02";
        } else if (month.equals("Mar")) {
            month = "03";
        } else if (month.startsWith("Ap")) {
            month = "04";
        } else if (month.equals("May")) {
            month = "05";
        } else if (month.equals("Jun")) {
            month = "06";
        } else if (month.equals("Jul")) {
            month = "07";
        } else if (month.startsWith("Au")) {
            month = "08";
        } else if (month.charAt(0) == 'S') {
            month = "09";
        } else if (month.charAt(0) == 'O') {
            month = "10";
        } else if (month.charAt(0) == 'N') {
            month = "11";
        } else {
            month = "12";
        }
        String day = preProcess[0];
        if (day.length() == 3) {
            day = '0' + "" + day.charAt(0);
        } else {
            day = day.charAt(0) + "" + day.charAt(1);
        }
        return sb.append(year).append("-").append(month).append("-").append(day).toString();
    }
}
