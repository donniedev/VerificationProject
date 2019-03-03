package cm;

import org.junit.Test;

import junit.framework.Assert;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import java.util.ArrayList;


public class DanielDudaTask1 {
		

	@org.junit.Test(expected = IllegalArgumentException.class)
    public void testPeriodStartHourBelowZero() throws Exception {
				
		Period testPeriod = new Period(-1, 20);
			      
    }
		
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void testPeriodEndHourBelowZero() throws Exception {
				
		Period testPeriod = new Period(15, -16);	
	
    }
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void testPeriodStartHourBiggerThan24() throws Exception {
				
		Period testPeriod = new Period(37, 12);
    }
	
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void testPeriodEndHourBiggerThan24() throws Exception {
			
		Period testPeriod = new Period(12, -55);
		
    }
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void testPeriodStartBiggerThanPeriodEnd() throws Exception {
			
		Period testPeriod = new Period(15, 12);

    }
	
	@org.junit.Test
    public void testFreeRate() throws Exception {
			
		BigDecimal hourlyNormalRate = new BigDecimal("4");
		BigDecimal hourlyReducedRate = new BigDecimal("2");;
		
		Period testPeriod = new Period(2, 5);
		
		Period reducedPeriod = new Period(18, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
		
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 17);
		normalPeriods.add(normalPeriod);
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        assertEquals(rate.calculate(testPeriod), new BigDecimal("0"));
    }
	
	
	
	@org.junit.Test
    public void calculateNormalRate() throws Exception {
			
		BigDecimal hourlyNormalRate = new BigDecimal("4");
		BigDecimal hourlyReducedRate = new BigDecimal("2");;
		
		Period testPeriod = new Period(8, 12);
		
		Period reducedPeriod = new Period(18, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
		
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 17);
		normalPeriods.add(normalPeriod);
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        assertEquals(rate.calculate(testPeriod), new BigDecimal("16"));
    }
	
	@org.junit.Test
    public void calculateReducedRate() throws Exception {
			
		BigDecimal hourlyNormalRate = new BigDecimal("4");
		BigDecimal hourlyReducedRate = new BigDecimal("2");;
		
		Period testPeriod = new Period(18, 20);
		
		Period reducedPeriod = new Period(18, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
		
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 17);
		normalPeriods.add(normalPeriod);
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        assertEquals(rate.calculate(testPeriod), new BigDecimal("4"));
    }
	
	@org.junit.Test
    public void calculateMixedRate() throws Exception {
			
		BigDecimal hourlyNormalRate = new BigDecimal("4");
		BigDecimal hourlyReducedRate = new BigDecimal("2");;
		
		Period testPeriod = new Period(15, 20);
		
		Period reducedPeriod = new Period(18, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
		
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 17);
		normalPeriods.add(normalPeriod);
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        assertEquals(rate.calculate(testPeriod), new BigDecimal("4"));
    }
	
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void testRateConstructorInvalidNormalRate() throws Exception {
				
		Period testPeriod = new Period(18, 20);
		
		Period reducedPeriod = new Period(18, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
		
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 17);
		normalPeriods.add(normalPeriod);
		
		BigDecimal hourlyNormalRate = new BigDecimal("-4");
		BigDecimal hourlyReducedRate = new BigDecimal("2");;
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyNormalRate, reducedPeriods, normalPeriods);
        
    }
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void testRateConstructorInvalidReducedRate() throws Exception {
				
		Period testPeriod = new Period(18, 20);
		
		Period reducedPeriod = new Period(18, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
		
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 17);
		normalPeriods.add(normalPeriod);
		
		BigDecimal hourlyNormalRate = new BigDecimal("4");
		BigDecimal hourlyReducedRate = new BigDecimal("-2");;
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        
    }
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void testRateConstructorNormalSmallerThanReduced() throws Exception {
				
		Period testPeriod = new Period(18, 20);
		
		Period reducedPeriod = new Period(18, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
		
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 17);
		normalPeriods.add(normalPeriod);
		
		BigDecimal hourlyNormalRate = new BigDecimal("4");
		BigDecimal hourlyReducedRate = new BigDecimal("6");;
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        
    }
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void testRateConstructorNormalCollectionsOverlap() throws Exception {
				
		Period testPeriod = new Period(18, 20);
		
		Period reducedPeriod = new Period(18, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
		
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 10);
		Period normalPeriod2 = new Period(8, 12);
		normalPeriods.add(normalPeriod);
		normalPeriods.add(normalPeriod2);
		
		BigDecimal hourlyNormalRate = new BigDecimal("4");
		BigDecimal hourlyReducedRate = new BigDecimal("2");;
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        
    }
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void testRateConstructorReducedCollectionsOverlap() throws Exception {
				
		Period testPeriod = new Period(18, 20);
		
		Period reducedPeriod = new Period(18, 21);
		Period reducedPeriod2 = new Period(19, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
		reducedPeriods.add(reducedPeriod2);
		
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 10);
		Period normalPeriod2 = new Period(8, 12);
		normalPeriods.add(normalPeriod);
		
		BigDecimal hourlyNormalRate = new BigDecimal("4");
		BigDecimal hourlyReducedRate = new BigDecimal("2");;
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        
    }
	
	@org.junit.Test
    public void testRateConstructorValidInput() throws Exception {
			
		BigDecimal hourlyNormalRate = new BigDecimal("4");
		BigDecimal hourlyReducedRate = new BigDecimal("2");;
				
		Period reducedPeriod = new Period(18, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
		
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 17);
		normalPeriods.add(normalPeriod);
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
    }
	
}

