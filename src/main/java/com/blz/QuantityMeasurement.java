package com.blz;

public class QuantityMeasurement {
    public boolean operation(double inch, double feet) {
     if (inch == feet * 12){
         return true;
     }
     return false;
    }
}
