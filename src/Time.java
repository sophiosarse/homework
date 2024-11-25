public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void displayTime() {
        String time = "";
        if (hour < 10) {
            time += "0" + hour;
        } else {
            time += hour;
        }
        time += ":";

        if (minute < 10) {
            time += "0" + minute;
        } else {
            time += minute;
        }
        time += ":";

        if (second < 10) {
            time += "0" + second;
        } else {
            time += second;
        }

        System.out.println(time);
    }
}
