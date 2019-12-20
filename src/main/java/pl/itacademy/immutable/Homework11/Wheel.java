package pl.itacademy.immutable.Homework11;

import lombok.Data;

import java.util.List;

@Data
public class Wheel {

    private int radius;
    private int width;

    public Wheel(int radius, int width) {
        this.radius = radius;
        this.width = width;
    }

    public static List<Wheel> wheels;

//    public int getRadius() {
//        return radius;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    @Override
//    public String toString() {
//        return "Wheel{" +
//                "radius=" + radius +
//                ", width=" + width +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Wheel)) return false;
//        Wheel wheel = (Wheel) o;
//        return radius == wheel.radius &&
//                width == wheel.width;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(radius, width);
//    }
}
