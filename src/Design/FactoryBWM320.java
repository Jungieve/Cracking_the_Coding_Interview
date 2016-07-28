package Design;

/**
 * Created by ZihanCong on 16/7/28.
 */
public class FactoryBWM320 implements FactoryBWM {
    @Override
    public BMW320 createBWM() {
        return new BMW320();
    }
}
