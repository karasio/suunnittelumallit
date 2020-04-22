package prototype;

import java.time.LocalTime;
import java.util.Observable;

public class ClockDeep extends Observable implements Runnable, Cloneable, Clock {
    private String name;
    private LocalTime time;
    private Hand seconds;
    private Hand minutes;
    private Hand hours;
    private boolean stopClock = false;


    public ClockDeep(LocalTime time) {
        this.time = time;
        seconds = new Hand(time.getSecond());
        minutes = new Hand(time.getMinute());
        hours = new Hand(time.getHour());
        name = "deep";
        System.out.println("ClockDeep created");
    }

    @Override
    public void run() {
        while(!stopClock()) {
            try {
                Thread.sleep(1000);
                time = time.plusSeconds(1);
                if (seconds.getValue() != time.getSecond()) {
                    seconds.setValue(time.getSecond());
                    if (minutes.getValue() != time.getMinute()) {
                        minutes.setValue(time.getMinute());
                    }
                    if (hours.getValue() != time.getHour()) {
                        hours.setValue(time.getMinute());
                    }
                    setChanged();
                    notifyObservers(this);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public ClockDeep clone() {
        ClockDeep c = null;
        try {
            c = (ClockDeep)super.clone();
            c.seconds = (Hand)seconds.clone();
            c.minutes = (Hand)minutes.clone();
            c.hours = (Hand)hours.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
        return c;
    }

    public void setStopClock(boolean stopClock) {
        this.stopClock = stopClock;
    }

    public boolean stopClock() {
        return stopClock;
    }

    public int getSeconds() {
        return seconds.getValue();
    }

    public int getMinutes() {
        return minutes.getValue();
    }

    public int getHours() {
        return hours.getValue();
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = "copy deep";
    }

}
