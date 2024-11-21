import io.zipcoder.polymorphism.Dog;
import org.junit.Assert;
import org.junit.Test;

public class GoatTest {


    @Test

    public void getNameTest(){

        String expected = "Rammy";
        Goat goat = new Goat();

        String actual = goat.getName();

        Assert.assertEquals(expected,actual);
    }


    @Test

    public void setNameTest(){
        Goat goat = new Goat();
        String expected = "Rammy";
        goat.setName();
        String actual = goat.setName();
        Assert.assertEquals(expected, actual);

    }


    @Test

    public void speakTest(){

        String expected = "BAAAAA!";
        Goat goat = new Goat();
        String actual = goat.speak();
        Assert.assertEquals(expected,actual);

    }

}
