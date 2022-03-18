package Exercice3p5;

public class Mydate {
    private int year;
    private int month;
    private int day;
    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
    public boolean isValidDate(int year, int month, int day) {
        if (year < 9999 && year > 1 && month >= 1 && month <= 12) {
            if (isLeapYear(year)) {
                if (day >= 1 && DAYS_IN_MONTHS[month - 1] <= day && month == 2 && day == 29) {
                    return true;
                }
            } else {
                if (day >= 1 && DAYS_IN_MONTHS[month - 1] <= day) {
                    return true;
                }

            }
        }
        return false;
    }
    public Mydate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getDay() {
        return day;
    }
    public boolean setDay(int day) {
        if (isLeapYear(year)) {
            if (day >= 1 && DAYS_IN_MONTHS[month - 1] <= day && month == 2 && day == 29) {
                this.day = day;
            }
            else{
                return false;
            }
        } else {
            if (day >= 1 && DAYS_IN_MONTHS[month - 1] <= day) {
                this.day = day;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public int getMonth() {
        return month;
    }
    public boolean setMonth(int month) {
        if (month >= 0 && month <= 12) {
            this.month = month;
        }
        else{
            return false;
        }
        return true;

    }
    public int getYear() {
        return year;
    }
    public boolean setYear(int year) {
        if (year < 9999 && year > 0) {
            this.year = year;
        }
        else{
            return false;
        }
        return true;
    }
    public String toString() {
        return getDay() + " "  + getMonth() + " " + getYear();
    }
    public Mydate nextDay() {
        if(setDay(++day)){
            return this;
        }
        else{
            setDay(1);
            nextMonth();
        }
        return this;
    }
    public Mydate nextMonth(){
        if(setMonth(++month)){
            return this;
        }
        else{
            setMonth(1);
            nextYear();
        }
        return this;
    }
    public Mydate nextYear(){
        if(setYear(++year)){
            return this;
        }
        else{
            System.err.println("t'as pas un gigot d'agneau");
        }
        return this;
    }
    public Mydate previousDay(){
        if(setDay(--day)){
            return this;
        }
        else{
            if(isLeapYear(year)){
                if(day > 0 && DAYS_IN_MONTHS[month-1] <= day && month == 3 && day == 1){
                    day=29;
                    previousMonth();
                }
                else{
                    day=DAYS_IN_MONTHS[--month];
                    previousMonth();
                }
            }
            else{
                if(day>0 && DAYS_IN_MONTHS[month-1] <= day){
                    day=DAYS_IN_MONTHS[month-2];
                    previousMonth();

                }
            }
            
        }
        return this;
    }
    public Mydate previousMonth(){
        if(setMonth(--month)){
            return this;
        }
        else{
            --month;
            setYear(--year);
        }
        return this;
    }
    public Mydate previousYear(){
        if(setYear(--year)){
            return this;
        }
        else{
            System.err.println("t'as pas un gigot d'agneau");
        }
        return this;
    }
    
}

