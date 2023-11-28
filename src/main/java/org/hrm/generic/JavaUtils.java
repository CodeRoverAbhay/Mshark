package org.hrm.generic;

import java.util.Random;

public class JavaUtils {
	public String getRandomId(String ID) {
		Random random = new Random();
		int randomNumber = random.nextInt(99);
		String randomId = ID + randomNumber;
		return randomId;
	}
}