package com.org.gen.day5;

import java.util.Arrays;
import java.util.List;

public class Service {
	
	public void ValidEmail(String email)  {
		
		if(!isDomainValid(email)) {
			throw new DomainNotValidException(email);
		}
	}

	
	private boolean isDomainValid(String Email) {
		List<String> ValidDomains = Arrays.asList("gmail.com","genpact.com","outlook.com");
		if(ValidDomains.contains(Email.substring(Email.indexOf("@")+1))) {
			return true;
		}
		return false;
	}
}
