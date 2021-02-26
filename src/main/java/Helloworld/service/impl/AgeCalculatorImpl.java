package Helloworld.service.impl;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import Helloworld.model.response.AgeResponse;
import Helloworld.service.AgeCalculator;

@Service
public class AgeCalculatorImpl implements AgeCalculator {

	public AgeResponse calculateAge( Date bithDay) {
		AgeResponse result = new AgeResponse();
		
		//Date today =new Date();
		LocalDate date=bithDay.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		
		
		LocalDate p=LocalDate.now();
		 Period x = Period.between(p,date); 
		
		
		result.setYears(Math.abs(x.getYears()));
		result.setMonths(Math.abs(x.getMonths()));
		result.setDays(Math.abs(x.getDays()));
		
		return result;
	}
	
}
