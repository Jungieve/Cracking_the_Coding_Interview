package Design;

/**
 * Created by ZihanCong on 16/7/28.
 */
public class DoubleCheckLazySingleton {
    private volatile static DoubleCheckLazySingleton instance = null;
    private DoubleCheckLazySingleton(){

    }
    public static synchronized DoubleCheckLazySingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckLazySingleton.class){
                if(instance == null)
                    instance = new DoubleCheckLazySingleton();
            }
        }
        return instance;
    }
}
