import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzz {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testFizz(){
        assertEquals("fizz", fizzBuzz.execut(3));
    }
}