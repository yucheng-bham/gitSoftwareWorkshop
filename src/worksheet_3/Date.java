package worksheet_3;

public class Date {
    /**
     * A class Date with three field variables day, month and year respectively.
     */
        private int day;
        private String month;
        private int year;

        /**
         *
         * @param day The day of the date.
         * @param month The month of the date.
         * @param year The year of the date.
         */
        public Date(int day, String month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        /**
         * Getter for the day.
         * @return The day of the date.
         */
        public int getDay() {
            return day;
        }

        /**
         * Setter for the day. The day of the date is updated.
         * @param day The new day of the date.
         */
        public void setDay(int day) {
            this.day = day;
        }

        /**
         * Getter for the month.
         * @return The month of the date.
         */
        public String getMonth() {
            return month;
        }

        /**
         * Setter for the month. The month of the date is updated.
         * @param month The new month of the date.
         */
        public void setMonth(String month) {
            this.month = month;
        }

        /**
         * Getter for the year.
         * @return The year of the date.
         */
        public int getYear() {
            return year;
        }

        /**
         * Setter for the year. The year of date is updated.
         * @param year The new year of the date.
         */
        public void setYear(int year) {
            this.year = year;
        }

        /**
         *
         * @return A human readable description of the date in form of the
         *          three field variables specifying it.
         */
        @Override
        public String toString() {
            return  "" + day +
                    " " + month +
                    " " + year;
        }

        /**
         *
         * @param o the object is to be checked.
         * @return true when the o has the same reference of the Date or
         *              the o has the same value in data members of the Date.
         */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Date)) return false;
            Date date = (Date) o;
            return day == date.day &&
                    year == date.year &&
                    month.equals(date.month);
        }

    }
