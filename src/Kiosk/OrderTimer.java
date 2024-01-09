package Kiosk;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;


public class OrderTimer {
    static int count = 5;

    public void timerRun() {
        Menu menu = new Menu();
        Timer timer = new Timer();      // 스레드 돌리는거라서 조심해서써야
        int waitingNumber = 1;
        System.out.println("대기번호는"+ waitingNumber + "번 입니다");
        TimerTask timerTask = new TimerTask() {

            @Override
            public void run() {

                if (count >= 1) {
                    System.out.println(count + "초후 메인화면으로 이동합니다");
                    count--;
                } else {
                    System.out.println("대기번호는"+ waitingNumber + "번 입니다");
                    timer.cancel();
//                    menu.getReturnMenuCategoryView();
                }
            }
        };
        timer.schedule(timerTask, 1000, 1000);  // 수행할작업, 지연시간(1000이 1초),반복주기(반복문처럼 사용가능)
        // 처리속도에 영향을 줄수있어서 조심해야함.

    }

}