package com.emmasSpecialOfDay.specialOfTheDay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.PrintStream;

@SpringBootApplication
public class SpecialOfTheDayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpecialOfTheDayApplication.class, args);
		PrintStream printf = System.out.print("hello from the special of the day app");

	}
}
