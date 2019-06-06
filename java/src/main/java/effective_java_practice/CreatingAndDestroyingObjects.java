package effective_java_practice;

import effective_java_practice.model.*;
import sun.jvm.hotspot.utilities.Assert;

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

    /**
     * Use a singleton when you need 1 and only 1 instance of an object.
     *
     * Notes:
     * There are 3 ways recommended by Josh Bloch.
     * In all cases Josh Bloch does not recommend lazy loading a singleton.
     *
     * The 3 ways to implement a singleton are like this:
     * <ul>
     *     Create singleton and access with the instance itself as a public member.
     *     Make the instance itself private and get it with a public getter.
     *     Use an enum to get the instance. (Best way according to him)
     * </ul>
     */
    public static void enforceSingleTonPropertyExample() {
        MySingleton1 mySingleton1 = MySingleton1.MY_SINGLETON_1;
        MySingleton1 mySingleton1a = MySingleton1.MY_SINGLETON_1;

        MySingleton2 mySingleton2 =  MySingleton2.getInstance();
        MySingleton2 mySingleton2a =  MySingleton2.getInstance();

        MySingleton3 mySingleton3 = MySingleton3.INSTANCE;
        MySingleton3 mySingleton3a = MySingleton3.INSTANCE;

        System.out.println("Should be true: " + (mySingleton1 == mySingleton1a));
        System.out.println("Should be true: " + (mySingleton2 == mySingleton2a));
        System.out.println("Should be true: " + (mySingleton3 == mySingleton3a));
        System.out.print("Say ");
        mySingleton1.sayHi();
        System.out.print("Say ");
        mySingleton3.INSTANCE.sayHi();

    }

    /**
     * Enforce non instantiability with a private constructor when you want to make a class non
     * instantiable.
     *
     * Notes:
     * Noninstantiability may be desired when grouping utility methods together or  creating a
     * factory or some other reason when you dont want to create objects of the class.
     * The private constructor can throw an assertion error to ensure that an object of itself is not created
     * inside the class also prevent class from being subclassed.
     */
    public static void enforceNonInstantiability () {
        NonInstantiable.sayHi();
    }
}
