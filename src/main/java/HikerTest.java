import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YYM-M on 5/29/16.
 */
public class HikerTest {
    @Test
    public void should_A() {
        //given
        //When
        //Then
        assertEquals("...Fizz...",Hiker.FizzAndBuzz(9));
        assertEquals("...Fizz...",Hiker.FizzAndBuzz(3));
        assertEquals("...Fizz...",Hiker.FizzAndBuzz(31));
        assertEquals("...Fizz...",Hiker.FizzAndBuzz(13));
        assertEquals("...Buzz...",Hiker.FizzAndBuzz(10));
        assertEquals("...FizzBuzz...",Hiker.FizzAndBuzz(15));
        assertEquals("...Buzz...",Hiker.FizzAndBuzz(50));
        assertEquals("...Fizz...",Hiker.FizzAndBuzz(51));

    }
}
