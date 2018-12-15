package com.lti.miscellaneous;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunTestCalc {

	public static void main(String args[]) {
		Result result=JUnitCore.runClasses(TestCalc.class);
		List<Failure>  failures=result.getFailures();
		System.out.println("List of Failures");
		
		for(Failure failure: failures) {
			System.out.println(failure);
		}
	}
	
}
                                                                        