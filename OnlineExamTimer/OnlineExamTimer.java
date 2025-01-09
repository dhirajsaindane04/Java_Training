package OnlineExamTimer;

import java.util.concurrent.TimeUnit;

public class OnlineExamTimer {

    public static void main(String[] args) {
        int examDurationMinutes = 30;
        int remainingTime = examDurationMinutes * 60;
        while (remainingTime > 0) {
            int minutesLeft = remainingTime / 60;
            int secondsLeft = remainingTime % 60;
            System.out.println("Time remaining: " + minutesLeft + " minutes and " + secondsLeft + " seconds.");
            try {
                TimeUnit.SECONDS.sleep(60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            remainingTime -= 60;
        }
        System.out.println("Time's up! The exam has ended.");
    }
}
