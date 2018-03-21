package com.java8;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InferenceStaticMethod {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		// Runnable command = () -> System.out.println("My App");
		Runnable command = InferenceStaticMethod::myRun;
		executorService.execute(command);

	}

	private static void myRun() {
		System.out.println("my App");
	}

}
