package com.in28minutes.learnspringframework.example.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBService implements DataService{

	public int[] retrieveData() {
		return new int[] {11,12,13,14,15};
	}
}
