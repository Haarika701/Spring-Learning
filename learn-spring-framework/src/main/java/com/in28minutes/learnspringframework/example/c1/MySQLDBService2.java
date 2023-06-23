package com.in28minutes.learnspringframework.example.c1;

import org.springframework.stereotype.Component;

@Component
public class MySQLDBService2 implements DataService{

	public int[] retrieveData() {
		return new int[] {11,12,13,14,15};
	}
}
