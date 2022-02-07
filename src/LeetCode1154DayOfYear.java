public class LeetCode1154DayOfYear {
    public static void main(String[] args) {
        System.out.println(dayOfYear("2019-12-21"));
        System.out.println(dayOfYear("2000-12-04"));
    }

    public static int dayOfYear(String date) {
        String[] numbers = date.split("-");
        int year = Integer.parseInt(numbers[0]);
        int month = Integer.parseInt(numbers[1]);
        int day = Integer.parseInt(numbers[2]);
        int nthDay = 0;
        if (month == 1) {
            nthDay = day;
        }
        if (month > 1) {
            nthDay = day + 31;
        }
        if (month > 2) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        nthDay += 29;
                    } else {
                        nthDay += 28;
                    }
                } else {
                    nthDay += 29;
                }
            } else {
                nthDay += 28;
            }
        }
        if (month > 3) {
            nthDay += 31;
        }
        if (month > 4) {
            nthDay += 30;
        }
        if (month > 5) {
            nthDay += 31;
        }
        if (month > 6) {
            nthDay += 30;
        }
        if (month > 7) {
            nthDay += 31;
        }
        if (month > 8) {
            nthDay += 31;
        }
        if (month > 9) {
            nthDay += 30;
        }
        if (month > 10) {
            nthDay += 31;
        }
        if (month > 11) {
            nthDay += 30;
        }
        return nthDay;
    }
}
