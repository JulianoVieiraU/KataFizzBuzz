import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzz {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testFizz(){
        assertEquals("Fizz", fizzBuzz.execute(3));
        assertEquals("Buzz", fizzBuzz.execute(5));
    }
}
