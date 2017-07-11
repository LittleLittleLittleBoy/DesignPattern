import Interface.Strategy;

/**
 * 进行策略使用调度
 * Created by 李伟民 on 17/7/11.
 */
public class Context {
    private Strategy strategy;

    /**
     * 构造方法持有一个策略对象的实例
     * @param strategy
     */
    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    /**
     * 获取结果时，根据strategy的实例统一调用接口方法
     * @param a 参数
     * @param b 参数
     * @return
     */
    public int execute(int a,int b){
        return strategy.doOperation(a,b);
    }
}
