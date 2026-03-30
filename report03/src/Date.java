public class Date {
    int year;
    int month;
    int day;

    Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;

        // 유효성 검사
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            System.out.println("잘못된 날짜입니다. 연도를 2023으로 수정합니다.");
            this.year = 2023;
        }
    }

    // 윤년 체크
    boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
