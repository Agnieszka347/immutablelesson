package pl.itacademy.immutable.Homework11;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class ImmutableCar {

    private final String manufacturer;
    private final String model;
    private Engine engine;
    private Wheel wheels;

    private ImmutableCar(String manufacturer, String model,Engine engine, Wheel wheels) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = copyEngine(engine);
        this.wheels = copyWheel (wheels) ;
    }
    
    private Wheel copyWheel(Wheel wheels) {
        return new Wheel(wheels.getRadius(),wheels.getWidth());
    }


    public static ImmutableCar createImmutableCar(String manufacturer, String model, Engine engine, Wheel wheels) {
        return new ImmutableCar (manufacturer, model,engine, wheels);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return copyEngine(engine);
    }

    private Engine copyEngine(Engine engine) {
        return new Engine (engine.getType(), engine.getHorsePower(), engine.getVolume());
    }

    public Wheel getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "ImmutableCar{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ImmutableCar)) return false;
        ImmutableCar that = (ImmutableCar) o;
        return Objects.equals(manufacturer, that.manufacturer) &&
                Objects.equals(model, that.model) &&
                Objects.equals(engine, that.engine) &&
                Objects.equals(wheels, that.wheels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, engine, wheels);
    }
}
