package tasks._05_basic_of_oop.task3;

public class Calendar {
    private Date[][] months = new Date[][]
            {new Date[31], new Date[28], new Date[31], new Date[30], new Date[31],
                    new Date[30], new Date[31], new Date[31], new Date[30], new Date[31], new Date[30], new Date[31]};

    {
        for (int i = 0; i < months.length; i++) {
            for (int j = 0; j < months[i].length; j++) {
                months[i][j] = new Date(j + 1, i + 1);
            }
        }
    }

    public void printCalendar() {
        for (Date[] month : months) {
            for (Date date : month) {
                System.out.println(date);
            }
        }
    }

    public void setInformationAboutHolidays(String info, int month, int day) {
        months[month-1][day-1].setInfo(info);
    }

    public class Date {
        private int numberDay;
        private int numberMonth;
        private String info;

        public Date(int number, int numberMonth) {
            this.numberDay = number;
            this.numberMonth = numberMonth;
        }

        public Date(int number, int numberMonth, String info) {
            this.numberDay = number;
            this.numberMonth = numberMonth;
            this.info = info;
        }

        @Override
        public String toString() {
            return "Date{" +
                    "numberDay=" + numberDay +
                    ", numberMonth=" + numberMonth +
                    ", info='" + info + '\'' +
                    '}';
        }

        public int getNumberDay() {
            return numberDay;
        }

        public void setNumberDay(int numberDay) {
            this.numberDay = numberDay;
        }

        public int getNumberMonth() {
            return numberMonth;
        }

        public void setNumberMonth(int numberMonth) {
            this.numberMonth = numberMonth;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
    }
}
