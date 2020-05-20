package com.company;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {

    @Test(expected = NumberFormatException.class)
    public void isEmptyString() {
        Integer.decode("");
    }

    @Test(expected = NullPointerException.class)
    public void isNull(){
        String example = null;
        Assert.assertNotNull(Integer.decode(example));
    }
    @Test(expected = NullPointerException.class)
    public void isNotNull(){
        int a = 1;
        Assert.assertNotNull(a);
    }

    @Test(expected = NumberFormatException.class)
    public void isString_Java(){
        Integer.decode("Java");
    }

    @Test //наверн в другом варианте здесь было бы уместно IOExeption
    public void isEquals(){
        //Assert.assertTrue(1 == Integer.decode("1").intValue());
        Assert.assertEquals(1,  Integer.decode("1").intValue());
    }

    @Test
    public void isNotEquals(){
        //Assert.assertFalse(2 == Integer.decode("1").intValue());
        Assert.assertNotEquals(2,  Integer.decode("1").intValue());
    }

    @Test
    public void isSame(){
        Assert.assertSame(1, Integer.decode("1").intValue());
    }

    @Test
    public void isNotSame(){
        Assert.assertNotSame(1, Integer.decode("2").intValue());
    }

    @Test(expected = NumberFormatException.class)
    public void isDouble(){
        Integer.decode("1.11"); //подойдет и с запятой
    }

    @Test
    public void isSizeSame(){
        Assert.assertEquals(Integer.SIZE, Integer.decode("32").intValue());
    }

    @Test
    public void isSizeNotSame(){
        Assert.assertEquals(Integer.SIZE, Integer.decode("99").intValue());
    }
}