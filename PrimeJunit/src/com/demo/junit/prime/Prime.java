package com.demo.junit.prime;

public class Prime {

	public String PrimeMethod(int number) {
		int i,flag=0;
		for(i=2;i<number;i++) {
			if((number%i) == 0) {
				flag=1;
				break;
			}
		}

		if(number==1) {
			return "1 is neither prime nor composite";
		}

		if(flag==1) {
			return "number is not prime";
		}
		else {
			return "number is prime";
		}

	}

}
