package jcb.my_proxy;

/**
 *  TaxtCar 静态代理
 * @author jcb
 *
 */
public class CarProxy implements Car {

    private TaxtCar taxtCar;

    public CarProxy(TaxtCar taxtCar){
        this.taxtCar=taxtCar;

    }

    @Override
    public void drive() {
        System.out.println("CarProxy drive");
        taxtCar.drive();
    }
}
