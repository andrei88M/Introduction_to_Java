package tasks._04_programming_with_classes.simplest_classes_and_objects.task6;

public class Clock {
    private int hour;
    private int minute;
    private int sec;

    public Clock() {
        hour = 0;
        minute = 0;
        sec = 0;
    }

    public Clock(int hour, int minute, int sec) {
        if (hour < 0 || minute < 0 || sec < 0) {
            this.hour = 0;
            this.minute = 0;
            this.sec = 0;
        }
        this.hour = hour;
        this.minute = minute;
        this.sec = sec;
        rain();
    }

    public void printTime(){
        System.out.println(hour + " : " + minute + " : " + sec);
    }

    private void rain() {
        while (sec >= 60) {
            sec = sec - 60;
            minute++;

        }
        while (minute >= 60) {
            minute = minute - 60;
            hour++;
        }
    }

    public void change(int hour, int minute, int sec) {
        this.hour += hour;
        this.minute += minute;
        this.sec += sec;
        rain();
    }
}
