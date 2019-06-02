package effective_java_practice;

import effective_java_practice.model.Pizza;
import effective_java_practice.model.Timespan;

import java.util.ArrayList;
import java.util.List;

public class CreatingAndDestroyingObjects {

    /**
     * Static factory methods, Use them if:
     * <ul>
     * You want to construct an object in many different ways but given the same parameters
     * You want to contruct an object with a better name then what is required if doing it with constructor.
     * You need to create singletons.
     * You want to return different subtypes of a class based on the parameters to the method.
     * You want to construct objects based on some kind of logic.
     * </ul>
     * Drawbacks of static factory methods.
     * Classes without public or protected constructors cannot be subclassed.
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

    /**
     * Use the builder pattern if:
     * <ul>
     *  You have a few required parameters and a large number of optional parameters.
     * </ul>
     * Notes:
     * Check parameter validity in in builders constructor, throw an illegal argument exception if something is wrong.
     * Use hierarchies of builders if needed.
     *
     */
    public static void builderPatternExample() {
        Pizza pizza =  new Pizza.Builder("NORMAL", "RED").withMushrooms("NORMAL").build();
        System.out.println(pizza.getMushrooms());
    }
}
