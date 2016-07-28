package Design;

/**
 * Created by ZihanCong on 16/7/28.
 */
public class FactoryBWM523 implements FactoryBWM {
    @Override
    public BWM523 createBWM() {
        return new BWM523();
    }
}
