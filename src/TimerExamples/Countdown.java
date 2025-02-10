package TimerExamples;

import java.util.Timer;
import java.util.TimerTask;

public class Countdown {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 10;

            @Override
            public void run() {
                System.out.println(count);
                count--;

                if (count < 0) {
                    System.out.println("happy new year");
                    timer.cancel();
                }
            }
        };

        // timer.schedule(task, 0, 1000);
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
