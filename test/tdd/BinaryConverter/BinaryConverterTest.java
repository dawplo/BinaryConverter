package tdd.BinaryConverter;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.fail;

public class BinaryConverterTest {
    @Test
    public void convertNullToBinary(){
        BinaryConverter binaryConverter = new BinaryConverter();
        try {
            binaryConverter.toBinary(null);
            fail();
        }  catch (IncorectArgumentException e){

        }
    }

    @Test
    public void convertZeroToBinary(){
        BinaryConverter binaryConverter = new BinaryConverter();
        String binaryZero = binaryConverter.toBinary(0);
        assertEquals("0", binaryZero);
    }
    @Test
    public void convertOneToBinary(){
        BinaryConverter binaryConverter = new BinaryConverter();
    String binaryOne = binaryConverter.toBinary();
    assertEquals("1", binaryOne);
    }
}
