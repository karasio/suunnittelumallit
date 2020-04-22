package prototype;

import prototype.resources.ReadInput;

import java.util.ArrayList;
import java.util.List;

public class TextMenu {
    public static void main(String[] args) {
        List<Clock> clocks = new ArrayList<>();
        ClockShallow shallow = new ClockShallow(java.time.LocalTime.now());
        clocks.add(shallow);
        ClockDeep deep = new ClockDeep(java.time.LocalTime.now());
        clocks.add(deep);
        new Thread(shallow).start();
        new Thread(deep).start();

        char selection;

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("1. Clone shallow clock");
            System.out.print("\t\t2. Clone deep clock");
            System.out.println("\t\t3. Print all clocks");
            System.out.println("----------------------------------------------------------------------------");
            selection = ReadInput.merkki();
            switch (selection) {
                case '1':
                    ClockShallow copyShallow = (ClockShallow)shallow.clone();
                    copyShallow.setName();
                    clocks.add(copyShallow);
                    try {
                        System.out.println("Waiting 5s before starting the clone");
                        Thread.sleep(5000);
                        new Thread(copyShallow).start();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case '2':
                    ClockDeep copyDeep = deep.clone();
                    copyDeep.setName();
                    clocks.add(copyDeep);
                    try {
                        System.out.println("Waiting 5s before starting the clone");
                        Thread.sleep(5000);
                        new Thread(copyDeep).start();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case '3':
                    for(Clock c : clocks) {
                        System.out.println(printTime(c));
                    }
                    break;
                default:
                    break;
            }


        } while (selection != 'q');
        System.exit(-1);
    }

    public static String printTime(Clock temp) {
        String sHour = temp.getHours() < 10 ? "0" + temp.getHours() : "" + temp.getHours();
        String sMinute = temp.getMinutes() < 10 ? "0" + temp.getMinutes() : "" + temp.getMinutes();
        String sSecond = temp.getSeconds() < 10 ? "0" + temp.getSeconds() : "" + temp.getSeconds();
        String time = sHour + ":" + sMinute + ":" + sSecond + "\t" + temp.getName();
        return time;
    }
}
