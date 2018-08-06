import java.util.Random;
import java.util.concurrent.Executors;

public class ServiceWindow {

    private int windowNum = 1;




    public void start() {
        Executors.newSingleThreadExecutor().execute(new Runnable() {
            @Override
            public void run() {
                while (true) {

                    normalService();

                }
            }
        });
    }

    private void normalService() {
        Integer serviceNumber = NumberMachine.getInstance().getNormalNumberManager().getFetchNumber();
        System.out.println("第" + windowNum + "窗口开始开始获取快速任务......");
        String windowName = "第" + windowNum + "号" + "窗口";
        if (serviceNumber != null) {
            System.out.println(windowName + "开始为普通客户[" + serviceNumber + "]服务");
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(windowName + "完成为普通客户[" + serviceNumber + "]服务，总共耗时9秒");
        } else {

            System.out.println(windowName + "没有取到普通任务，正在空闲一秒");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


}
