package cm.dart.BigNombre;

import java.math.BigDecimal;


import java.math.MathContext;

public class BigOperation {
	 BigDecimal big1,big2,big3;

	public BigOperation() {
		
	}
	 public void add( BigDecimal big3,MathContext th){
		 big3 = big1.add(big2,th);	 
	 }
    public void substract(BigDecimal big3, MathContext th){
    	big3 =big1.subtract(big2,th);
    	
    }
    public void multiply(BigDecimal big3,MathContext th){
    	 big3 = big1.multiply(big2, th);
    	 
    }
    public void divide(BigDecimal big3, MathContext th){
    	big3 = big1.divide(big2, th);
    }
}
