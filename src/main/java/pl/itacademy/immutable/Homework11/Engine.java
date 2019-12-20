package pl.itacademy.immutable.Homework11;

import lombok.Data;

@Data
public class Engine {

    private String type;
    private int horsePower;
    private int volume;

    public Engine(String type, int horsePower, int volume) {
        this.type = type;
        this.horsePower = horsePower;
        this.volume = volume;
    }

    public Engine(String type) {
    }

//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public int getHorsePower() {
//        return horsePower;
//    }
//
//    public void setHorsePower(int horsePower) {
//        this.horsePower = horsePower;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }

//    @Override
//    public String toString() {
//        return "Engine{" +
//                "type='" + type + '\'' +
//                ", horsePower=" + horsePower +
//                ", volume=" + volume +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Engine)) return false;
//        Engine engine = (Engine) o;
//        return horsePower == engine.horsePower &&
//                volume == engine.volume &&
//                Objects.equals(type, engine.type);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(type, horsePower, volume);
//    }
}
