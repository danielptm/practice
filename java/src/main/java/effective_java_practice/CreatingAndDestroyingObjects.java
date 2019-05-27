package effective_java_practice;

import effective_java_practice.model.Timespan;

import java.util.ArrayList;
import java.util.List;

public class CreatingAndDestroyingObjects {

    /**
     * Static factory methods: Use them if you want to construct an object in many different ways but given the same
     * parameters or if you want to contruct an object with a better name then what is required if doing it with
     * constructor. Or use them if to create singletons. Or if you want to return different subtypes of a class
     * based on the parameters to the method. Or if you want to construct objects based on some kind of logic.
     *
     * Drawbacks of static factory methods. Classes without public or protected constructors cannot be subclassed.
     * These methods can also be difficult to find in documentation so it can be difficult to know how to use them.
     *
     * If using static factory methods, see page 9 of effective java 3 for common naming convention which ease their use.
     */
    public List<Timespan> staticFactoryMethodExample() {
        List<Timespan> timespanList = new ArrayList<>();
        Timespan timespan = Timespan.fromNowInMinutes(1);
        Timespan timespan1 = Timespan.fromNowInSeconds(60);
        timespanList.add(timespan);
        timespanList.add(timespan1);
        return timespanList;
    }
}
