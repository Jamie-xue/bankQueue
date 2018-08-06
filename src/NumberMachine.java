public class NumberMachine {

    private NumberMachine() {
    }

    //将NumberMachine类设计成单例
    private static NumberMachine instance = new NumberMachine();

    public static NumberMachine getInstance() {
        return instance;
    }


    private NumberManager normalNumberManager = new NumberManager();
    public NumberManager getNormalNumberManager() {
        return normalNumberManager;
    }


}
