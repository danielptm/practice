package IO;

import java.io.Serializable;

public class Greeting implements Serializable{
    String hello;
    String world;

    public Greeting(){}


    public Greeting(String hello, String world) {
        this.hello = hello;
        this.world = world;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Greeting{");
        sb.append("hello='").append(hello).append('\'');
        sb.append(", world='").append(world).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
