package unitTestExample.sctt.kdu.ac.lk;


import org.junit.Assert;
import org.junit.Test;

public class DemoClassTest {


    @Test
    public void assureThatDoSomethingReturnsLowValueInts() {

        //creating the object
        DemoClass demoObject = new DemoClass();

        int returned0 = demoObject.doSomething("", 0);
        Assert.assertEquals(0, returned0);

        int returned9 = demoObject.doSomething("", 9);
        Assert.assertEquals(9, returned9);

        int returnedMin = demoObject.doSomething("", Integer.MIN_VALUE);
        Assert.assertEquals(Integer.MIN_VALUE, returnedMin);

    }

    @Test
    public void assureThatDoSomethingReturnsParsedStringForHighParam2Values() {

        //creating the object
        DemoClass demoObject = new DemoClass();

        int returned1234 = demoObject.doSomething("1234", 10);
        Assert.assertEquals(1234, returned1234);


        int returned4567 = demoObject.doSomething("4567", Integer.MAX_VALUE);
        Assert.assertEquals(4567, returned4567);
    }


}
