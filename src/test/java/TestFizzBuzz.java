import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzz {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testFizz(){
        assertEquals("Fizz", fizzBuzz.execute(3));
    }

    @Test
    public void testBuzz(){
        assertEquals("Buzz", fizzBuzz.execute(5));
    }

    @Test
    public void testFizzBuzz(){
        assertEquals("FizzBuzz", fizzBuzz.execute(15));
    }

    @Test
    public void testNotFizzOrBuzz(){
        assertEquals("1", fizzBuzz.execute(1));
    }
}
