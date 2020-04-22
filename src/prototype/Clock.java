package prototype;

public interface Clock {
    int getHours();
    int getMinutes();
    int getSeconds();
    void setStopClock(boolean b);
    String getName();
    void setName();
}
