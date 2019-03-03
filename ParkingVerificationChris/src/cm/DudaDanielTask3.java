package cm;


import org.junit.Test;

import junit.extensions.TestSetup;
import junit.framework.Assert;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import java.util.ArrayList;


public class DudaDanielTask3 {
		

	@org.junit.Test(expected = IllegalArgumentException.class)
    public void periodStartHourBelowZero() throws Exception {
				
		Period testPeriod = new Period(-1, 20);
			      
    }
		
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void periodEndHourBelowZero() throws Exception {
				
		Period testPeriod = new Period(15, -16);	
	
    }
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void periodStartHourBiggerThan24() throws Exception {
				
		Period testPeriod = new Period(37, 12);
    }
	
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void periodEndHourBiggerThan24() throws Exception {
			
		Period testPeriod = new Period(12, -55);
		
    }
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void periodStartBiggerThanPeriodEnd() throws Exception {
			
		Period testPeriod = new Period(15, 12);

    }
	
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void reducedPeriodsNull() throws Exception {
						
		ArrayList<Period> reducedPeriods = null;
			
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 17);
		normalPeriods.add(normalPeriod);
		
		BigDecimal hourlyNormalRate = new BigDecimal("4");
		BigDecimal hourlyReducedRate = new BigDecimal("6");;
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        
    }
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void normalPeriodsNull() throws Exception {
					
		Period reducedPeriod = new Period(18, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
			
		ArrayList<Period> normalPeriods = null;

		BigDecimal hourlyNormalRate = new BigDecimal("4");
		BigDecimal hourlyReducedRate = new BigDecimal("6");;
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        
    }
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void normalRateNull() throws Exception {
				
		Period reducedPeriod = new Period(18, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
			
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 17);
		normalPeriods.add(normalPeriod);

		BigDecimal hourlyNormalRate = null;
		BigDecimal hourlyReducedRate = new BigDecimal("6");;
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        
    }
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void reducedRateNull() throws Exception {
						
		Period reducedPeriod = new Period(18, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
			
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 17);
		normalPeriods.add(normalPeriod);

		BigDecimal hourlyNormalRate = new BigDecimal("6");;
		BigDecimal hourlyReducedRate = null;
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        
    }
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void normalRateLowerThan0() throws Exception {
				
		Period reducedPeriod = new Period(18, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
			
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 17);
		normalPeriods.add(normalPeriod);

		BigDecimal hourlyNormalRate =  new BigDecimal("-4");
		BigDecimal hourlyReducedRate = new BigDecimal("6");
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        
    }
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void reducedRateLowerThan0() throws Exception {
				
		Period reducedPeriod = new Period(18, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
			
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 17);
		normalPeriods.add(normalPeriod);

		BigDecimal hourlyNormalRate =  new BigDecimal("4");
		BigDecimal hourlyReducedRate = new BigDecimal("-6");
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        
    }
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void normalRateLowerThanReducedRate() throws Exception {
				
		Period reducedPeriod = new Period(18, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
			
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 17);
		normalPeriods.add(normalPeriod);

		BigDecimal hourlyNormalRate =  new BigDecimal("4");
		BigDecimal hourlyReducedRate = new BigDecimal("6");
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        
    }
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void normalRateEqualToReducedRate() throws Exception {
				
		Period reducedPeriod = new Period(18, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
			
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 17);
		normalPeriods.add(normalPeriod);

		BigDecimal hourlyNormalRate =  new BigDecimal("4");
		BigDecimal hourlyReducedRate = new BigDecimal("4");
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        
    }
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void notValidReducedPeriods() throws Exception {
					
		Period reducedPeriod = new Period(18, 21);
		Period reducedPeriod2 = new Period(19, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
		reducedPeriods.add(reducedPeriod2);
		
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 10);
		normalPeriods.add(normalPeriod);
		
		BigDecimal hourlyNormalRate = new BigDecimal("4");
		BigDecimal hourlyReducedRate = new BigDecimal("2");;
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        
    }
	
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void notValidNormalPeriods() throws Exception {
					
		Period reducedPeriod = new Period(18, 21);
		//Period reducedPeriod2 = new Period(19, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
		//reducedPeriods.add(reducedPeriod2);
		
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 10);
		Period normalPeriod2 = new Period(9, 12);
		normalPeriods.add(normalPeriod);
		normalPeriods.add(normalPeriod2);
		
		BigDecimal hourlyNormalRate = new BigDecimal("4");
		BigDecimal hourlyReducedRate = new BigDecimal("2");;
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        
    }
	
	
	@org.junit.Test(expected = IllegalArgumentException.class)
    public void periodOverlaps() throws Exception {
					
		Period reducedPeriod = new Period(16, 21);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
		
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 17);
		normalPeriods.add(normalPeriod);

		
		BigDecimal hourlyNormalRate = new BigDecimal("4");
		BigDecimal hourlyReducedRate = new BigDecimal("2");;
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        
    }
	
	
	@org.junit.Test
    public void rateAllValid() throws Exception {
			
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
	
//****************************Calculate Method Tests **************************************
	
	@org.junit.Test
    public void calculateFreeRate() throws Exception {
			
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
        assertEquals(rate.calculate(testPeriod), new BigDecimal("12"));
    }
	
	@org.junit.Test
    public void calculateStaffReduce() throws Exception {
			
		BigDecimal hourlyNormalRate = new BigDecimal("4");
		BigDecimal hourlyReducedRate = new BigDecimal("2");;
		
		Period testPeriod = new Period(8, 20);
		
		Period reducedPeriod = new Period(18, 23);
		ArrayList<Period> reducedPeriods = new ArrayList();
		reducedPeriods.add(reducedPeriod);
		
		ArrayList<Period> normalPeriods = new ArrayList<Period>();
		Period normalPeriod = new Period(7, 17);
		normalPeriods.add(normalPeriod);
		
        Rate rate = new Rate(CarParkKind.STAFF, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        assertEquals(rate.calculate(testPeriod), new BigDecimal("16"));
    }
	
}

