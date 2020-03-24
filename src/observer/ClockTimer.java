package observer;

import java.time.LocalTime;
import java.util.Observable;

public class ClockTimer extends Observable implements Runnable{
    private int second;
    LocalTime time;

    public ClockTimer() {
        time = java.time.LocalTime.now();
        second = time.getSecond();
    }

    @Override
    public void run() {
        while(true) {
            time = java.time.LocalTime.now();
            if (second != time.getSecond()) {
                String sHour = time.getHour() < 10 ? "0" + time.getHour() : "" + time.getHour();
                String sMinute = time.getMinute() < 10 ? "0" + time.getMinute() : "" + time.getMinute();
                String sSecond = time.getSecond() < 10 ? "0" + time.getSecond() : "" + time.getSecond();
                String sTime = sHour + ":" + sMinute + ":" + sSecond;
                setChanged();
                notifyObservers(sTime);
                second = time.getSecond();
            }
        }
    }
}
