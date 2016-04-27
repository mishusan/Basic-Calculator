package Das.Manjusha;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by manjushadas on 4/27/16.
 */
public class CalculatorSpec {

        @Test
        public void sumTest(){
            Calculator calculator = new Calculator();
            int expectedSum =4;
            int actualSum = calculator.sum(2,2);
            assertEquals("The expected value should be 2",expectedSum,actualSum);
        }
         @Test
    public void multiplyTest(){
        Calculator calculator = new Calculator();
        int expectedProduct =4;
        int actualProduct = calculator.multiply(2,2);
        assertEquals("The expected value should be 2",expectedProduct,actualProduct);
    }

    @Test
    public void divisionTest(){
        Calculator calculator = new Calculator();
        int expectedDivident =4;
        int actualDivident = calculator.divide(8,2);
        assertEquals("The expected value should be 4",expectedDivident,actualDivident);
    }

    @Test
    public void SubtractionTest(){
        Calculator calculator = new Calculator();
        int expectedDiff =6;
        int actualDiff = calculator.subtract(8,2);
        assertEquals("The expected value should be 4",expectedDiff,actualDiff);
    }
    }
