import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
            ServiceWindow normalWindow = new ServiceWindow();
            normalWindow.start();





        Executors.newScheduledThreadPool(1).scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                Integer customerNum = NumberMachine.getInstance().getNormalNumberManager().getNewNumber();
                System.out.println("普通客户["+customerNum+"]等待服务");

            }
        }, 0, 1, TimeUnit.SECONDS);



    }
}
