package pl.itacademy.immutable.Homework11;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ImmutableCarTester {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Map<ImmutableCar, String> createImmutableCar = new HashMap<>();

        Engine diesel = new Engine("Diesel", 220, 1000);
        Engine hybrid = new Engine("Hybrid", 200, 800);
        Engine electric = new Engine("Electric", 180, 600);

        Wheel wheel1 = new Wheel (100,50);
        Wheel wheel2 = new Wheel (70, 40);
        Wheel wheel3 = new Wheel (50,30);
        List<Wheel> wheels = new ArrayList<>();
        wheels.add(wheel1);
        wheels.add(wheel2);
        wheels.add(wheel3);


        ImmutableCar opel = ImmutableCar.createImmutableCar("Opel", "Astra", diesel, wheel1);
        ImmutableCar kia = ImmutableCar.createImmutableCar("Kia", "Niro", hybrid, wheel2);
        ImmutableCar fiat = ImmutableCar.createImmutableCar("Fiat", "126", electric, wheel3);

        createImmutableCar.put(opel, "Opel");
        createImmutableCar.put(kia, "Kia");
        createImmutableCar.put(fiat, "Fiat");

        System.out.println("Cars " + createImmutableCar);
        System.out.println(opel);
        System.out.println(opel.hashCode());
        System.out.println(kia);
        System.out.println(kia.hashCode());
        System.out.println(fiat);
        System.out.println(fiat.hashCode());
       

        Field model = opel.getClass().getDeclaredField("model");
        model.setAccessible(true);
        model.set(opel, "Corsa");

        System.out.println("Cars " + createImmutableCar);

        opel.getEngine().setHorsePower(250);
        kia.getEngine().setVolume(300);
        fiat.getEngine().setType("Hybrid");
        fiat.getWheels().setRadius(120);
        kia.getWheels().setWidth(10);
        
       System.out.println("Cars after change engine and wheel "+createImmutableCar );
        
        System.out.println(opel.hashCode());
        System.out.println(kia.hashCode());
        System.out.println(fiat.hashCode());
        
    }
}
