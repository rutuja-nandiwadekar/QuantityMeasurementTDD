package com.blz;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
@Test
    public void givenTypes_WhenEquals_ShouldReturnTrue(){
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
    boolean result = quantityMeasurement.operation(12,1);
    Assert.assertEquals(true, result);
    }
}
