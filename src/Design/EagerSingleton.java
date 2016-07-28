package Design;

/**
 * Created by ZihanCong on 16/7/28.
 * 饿汉式单例模式,在类加载时候就完成了初始化.
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){

    }
    //静态,不用同步(类加载时已完成初始化,不会有多线程的问题)
    public static EagerSingleton getInstance(){
        return instance;
    }
}
