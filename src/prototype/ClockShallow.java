package prototype;

import java.time.LocalTime;
import java.util.Observable;

public class ClockShallow extends Observable implements Runnable, Cloneable, Clock {
    private String name;
    private LocalTime time;
    private Hand seconds;
    private Hand minutes;
    private Hand hours;
    private boolean stopClock = false;


    public ClockShallow() {
        time = java.time.LocalTime.now();
    }

    public ClockShallow(LocalTime time) {
        this.time = time;
        seconds = new Hand(time.getSecond());
        minutes = new Hand(time.getMinute());
        hours = new Hand(time.getHour());
        name = "shallow";
        System.out.println("Shallow clock created");
    }

    @Override
    public void run() {
        while (!stopClock()) {
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


    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
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
        this.name = "copy shallow";
    }
}
