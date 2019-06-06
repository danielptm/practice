package practice.effective_java_practice;

import effective_java_practice.CreatingAndDestroyingObjects;
import effective_java_practice.model.Timespan;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CreatingAndDestroyingObjectsTest {

    @Test
    public void staticFactoryMethodExample() {
        CreatingAndDestroyingObjects creatingAndDestroyingObjects = new CreatingAndDestroyingObjects();
        List<Timespan> timespanList = creatingAndDestroyingObjects.staticFactoryMethodExample();
        Assert.assertEquals(timespanList.get(0).getEndTime(), timespanList.get(1).getEndTime());
    }

    @Test
    public void testBuilder() {
        CreatingAndDestroyingObjects.builderPatternExample();
    }

    @Test
    public void testSingleton() {
        CreatingAndDestroyingObjects.enforceSingleTonPropertyExample();
    }

    @Test
    public void testNonInstantiability() {
        CreatingAndDestroyingObjects.enforceNonInstantiability();
    }
}
