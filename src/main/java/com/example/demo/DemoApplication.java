package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Serializable;
import java.util.*;

@SpringBootApplication
public class DemoApplication implements Serializable, Cloneable {

	private int nameCount;

	private DemoApplication() {
		//super.label = "new";
	}

	public static String getName(Integer count) {
		return null;
	}


	public Collection<String> getUserName() {
		Set<? super Number> arr = new HashSet<>();
		arr.add(10);
		arr.add(10L);
		arr.add(10D);
		arr.add(10f);
		//return Arrays.asList("1", "2");
		return new HashSet<String>(Arrays.asList("1", "2"));
	}

	public static void main(String[] args) {
		//DemoApplication demoApplication = new DemoApplication();
		/*ollections
		Set<String> users = (Set<String>) demoApplication.getUserName();
		List<String> users2 = (List<String>) demoApplication.getUserName();*/

	}


	//@Override
	public String getName() {
		return null;
	}
}
