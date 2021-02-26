package Helloworld.service;

import java.util.Date;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import Helloworld.model.response.AgeResponse;


public interface AgeCalculator {

	public AgeResponse calculateAge(Date bithDay);
}
