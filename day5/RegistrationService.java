package com.org.gen.day5;

import java.util.Arrays;
import java.util.List;

public class RegistrationService {
	List<String> RegisteredName = Arrays.asList("abc","Xyz");
	
		public void ValidateName (String name) throws NameNotFoundException {
			if(RegisteredName.contains(name)) {
				throw new NameNotFoundException ("Name Alreaady Exist");
		}

	}

}
