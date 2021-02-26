package Helloworld.controller;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import Helloworld.service.AgeCalculator;
import Helloworld.utils.JasonUtil;

@RestController
@CrossOrigin
public class HomeControllar {
	@Autowired
	private  AgeCalculator ageCal;
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public @ResponseBody String Home(@RequestParam("birthDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date bithDate) {
		
		try
		{
			
			return JasonUtil.toJson(ageCal.calculateAge(bithDate));
		
	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

}
