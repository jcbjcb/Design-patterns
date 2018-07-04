package jcb.my_proxy;

import java.lang.reflect.Proxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        System.out.println( "Hello World!" );
//        static_proxy();
        dynamic_proxy();

    }

    //静态代理
    public static void static_proxy(){
        TaxtCar   taxtCar = new TaxtCar();

        CarProxy carProxy = new CarProxy(taxtCar);
        carProxy.drive();
    }

    public static void dynamic_proxy(){

        Car   car = new TaxtCar();
        JdkProxy   jdkProxy =  new JdkProxy(car);
        Object obj= Proxy.newProxyInstance(car.getClass().getClassLoader(),car.getClass().getInterfaces(),jdkProxy);
        Car car1 =(Car)obj;
        System.out.println(obj);
        car1.drive();
    }
}
