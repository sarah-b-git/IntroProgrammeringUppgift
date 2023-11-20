package textCounter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TextCounterTest {

    @Test
    public void tesGetArray(){
        //Arrange
        TextCounterMethods testMethods = new TextCounterMethods();
        String text = "dog cat horse butterfly sheep camel zebra";
        String expected = "dog";
        //Act
        testMethods.makeArray(text);
        String[] anArray = testMethods.getArray();
        String actual = anArray[0];
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNumberCharacters(){
        //Arrange
        TextCounterMethods testMethods = new TextCounterMethods();
        String[] anArray = {"this", "text", "has", "17", "char"};
        int expected = 17;
        //Act
        testMethods.setNumberCharacters(anArray);
        int actual = testMethods.getNumberCharacters();
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testGetLongestWord(){
        //Arrange
        TextCounterMethods testMethods = new TextCounterMethods();
        String[] anArray = {"zebra", "donkey", "hippopotamus", "horse", "pony"};
        String expected = "hippopotamus";
        //Act
        testMethods.setLongestWord(anArray);
        String actual = testMethods.getLongestWord();
        //Assert
        assertEquals(expected, actual);
    }





}
