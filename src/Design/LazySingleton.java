package Design;

/**
 * Created by ZihanCong on 16/7/28.
 * 最简单的单例模式:保证一个类仅有一个实例,并且提供一个访问它的全局点
 * 代码是懒汉式单例模式,特点在类加载时候,不创建实例
 */
public class LazySingleton {
    private static LazySingleton instance = null;//静态私有成员,不进行初始化
    private LazySingleton(){
        //私有构造函数
    }
    public static synchronized LazySingleton getInstance(){
        if(instance == null)
            instance = new LazySingleton();
        return instance;
    }
}
