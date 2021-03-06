package effective_java_practice;

import effective_java_practice.model.*;
import effective_java_practice.model.dictionary.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.regex.Pattern;

public class CreatingAndDestroyingObjects {

    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

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

    /**
     * Prefer dependency injection to hard wiring resources.
     * Why?
     * Hard wiring resources assumes that the class will only every care about that resource which is not flexible.
     * It makes it difficult to test.
     *
     * Notes:
     * A simple way is to inject dependencies in contructor.
     * Consider injecting resource factories if you need to create similar but different types of a resource.
     * Consider using a Supplier<T> as a resource factory
     * Consider using a dependency injection framework such as spring if you need many dependencies injected in order
     * to avoid unwieldly constructors.
     */
    public static void preferDependencyInejction() {
        Map<String, String> swedishDict = new HashMap<>();
        Map<String, String> spanishDict = new HashMap<>();


        //Basic dependency injection.
        SwedishDictionary dictionary = new SwedishDictionary(swedishDict);
        SpellChecker spellChecker = new SpellChecker(dictionary);


        //Possible way to use a Supplier as a factory and pass it to SpellChecker.
        Supplier<? extends Dictionary> supplier = () -> Math.random() > .50 ? new SwedishDictionary(swedishDict) : new SpanishDictionary(spanishDict);
        SpellChecker spellChecker1 = new SpellChecker(supplier);

    }

    /**
     * Avoid unnecessary object creation because you can obliterate your memory for no good reason.
     *
     * Notes:
     * Using static factory methods opposed to constructors helps to avoid unnecessary object creation.
     * Reuse immutable objects and objects you know wont be modified.
     * If an object is expensive to create such as a Pattern or a Database connection the consider using a cached instance.
     * While it is harmless to do so, has no benefit, don't call keyset on a Map instance multiple times.
     * Avoid autoboxing, especially in loops, use primitives opposed to Objects whenever possible.
     * Avoid using an object pool unless the objects are very expensive to create. (Example DB connection)
     * Still avoid object pools because modern JVM garbage collection would probably outperfrom it anyway and those things can destructure code.
     */
    public static void avoidUnnecessaryObjectCreation() {
        //Do not do this!
        //While in itself it is harmless, if this were part of a loop it would create new String objects
        //every time.
        String x = new String("x");

        //It is preferrable to do it like this because the same reference will be used.
        String y = "y";

        //Good way to use a Pattern instance.
        boolean answer = ROMAN.matcher("hi").matches();


        //Do NOT do this! 👇
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
    }

    /**
     * Eliminating obsolete object references is good to do because it will
     * reduce the possibility for memory leaks.
     *
     * Notes:
     * The Stack class creates a memory leak when using the pop method because
     * it allows references to exist outside of the active portion. Nulling them like
     * is done in popMemorySafe() is a way to eliminate these obsolete references.
     *
     * Nulling obsolete references is necessary because the Stack acts as a cache so as long
     * as the object itself exists and the pop method is used, obsolete references will be created.
     *
     * The best way to eliminate obsolete object references is to let the object fall out of scope.
     * One way a programmer can strive for this is define the variable that holds the reference
     * in the narrowest possible scope.
     *
     * When the programmer writes code that is responsible for memory management, there is
     * increased risk of memory leaks.
     *
     * Caches are susceptible to memory leaks as well as code that registers listeners and
     * callbacks that arent deregistered.
     *
     */
    public static void eliminateObsoleteReferences() {
        Stack stack = new Stack();

        stack.push("hi");
        stack.push("bye");
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.printStackSize();

        stack.push("hi");
        stack.push("bye");

//        stack.printStack();

        stack.popMemorySafe();
        stack.popMemorySafe();

//        stack.printStack();
//
//
//        stack.printStackSize();
    }

    /**
     * Don't use cleaners or finalizers except as a safety net.
     * Even still, don't expect the cleaner/finalizer to run. Just to be
     * safe, don't use them.
     */
    public static void cleanersAndFinalizers() {

    }
}
