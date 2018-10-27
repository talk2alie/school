public enum WeekDay {
    SUNDAY, 
    MONDAY, 
    TUESDAY, 
    WEDNESDAY, 
    THURSDAY, 
    FRIDAY, 
    SATURDAY;

    static boolean isWeekDay(WeekDay day) {
        return day != SATURDAY && day != SUNDAY;
    }

    boolean isWeekDay() {
        return isWeekDay(this);
    }
}