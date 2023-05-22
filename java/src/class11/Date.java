package class11;

public class Date {
    private int day; // the day of the month
    private int month; // the month of the year
    private int year; // the year

    /*
     * The constructor creates a new Date with the
     * given day, month and year.
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // gets the day of the month
    public int getDay() {
        return this.day;
    }

    // gets the month of the year
    public int getMonth() {
        return this.month;
    }

    // gets the year
    public int getYear() {
        return this.year;
    }

    // sets the day of the month
    public void setDay(int day) {
        this.day = day;
    }

    // sets the month of the year
    public void setMonth(int month) {
        this.month = month;
    }

    // sets the year
    public void setYear(int year) {
        this.year = year;
    }

    // returns the date as a string
    public String toString() {
        return "date: " + this.day + "/" + this.month + "/" + this.year;
    }

    // returns true if the date is in the current studing year, otherwise false.
    public boolean isLegal() {
        if(this.year == 2023) {
            return (this.month == 6 && this.day >= 1 && this.day <= 20) || (this.month >= 1 && this.month <= 5);
        } else if(this.year == 2022) {
            return this.month >= 9 && this.month <= 12;
        }
        return false;
    }

    /*
     * compares the dates and returns:
     *      -1 if the given date is later.
     *      1 if the given date is earlier.
     *      0 if the dates are equal.
     */
    public int compareTo(Date other) {
        if (this.year > other.year) {
            return 1;
        } else if (this.year < other.year) {
            return -1;
        } else if (this.year == other.year) {
            if (this.month > other.month) {
                return 1;
            } else if(this.month < other.month) {
                return -1;
            } else if(this.month == other.month) {
                if(this.day > other.day) {
                    return 1;
                } else if(this.day < other.day) {
                    return -1;
                } else if(this.day == other.day) {
                    return 0;
                }
            }
        }
        return 2;
    }
}

