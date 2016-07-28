package Design;

/**
 * Created by ZihanCong on 16/7/28.
 */
public class Customer {
    public static void main(String[] args) {
        FactoryBWM523 factoryBWM523 = new FactoryBWM523();
        BWM523 bwm523 = factoryBWM523.createBWM();
        FactoryBWM320 factoryBWM320 = new FactoryBWM320();
        BMW320 bmw320 = factoryBWM320.createBWM();
    }
}
