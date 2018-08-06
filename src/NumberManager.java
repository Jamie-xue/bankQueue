import java.util.ArrayList;
import java.util.List;

public class NumberManager {
    private  int num = 0;
    private  List numList = new ArrayList();

    //产生新号码的方法
    public  synchronized Integer getNewNumber() {
            numList.add(++num);
            return num;

    }

    //    获取马上要为之服务的号码
    public  synchronized Integer getFetchNumber() {
            if (numList.size() > 0) {
                return (Integer) numList.remove(0);
            } else {
                return null;
            }


    }


}
