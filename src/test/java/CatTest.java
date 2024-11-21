import io.zipcoder.polymorphism.Dog;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test

    public void getNameTest(){

        String expected = "Moose";
        Cat cat = new Cat();

        String actual = cat.getName();

        Assert.assertEquals(expected,actual);
    }


    @Test

    public void setNameTest(){
        Cat cat = new Cat();
        String expected = "Moose";
        cat.setName();
        String actual = cat.setName();
        Assert.assertEquals(expected, actual);

    }


    @Test

    public void speakTest(){

        String expected = "Meow!";
        Cat cat = new Cat();
        String actual = cat.speak();
        Assert.assertEquals(expected,actual);

    }

}


