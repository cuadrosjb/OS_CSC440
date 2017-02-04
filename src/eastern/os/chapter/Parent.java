package eastern.os.chapter;

import java.lang.management.ManagementFactory;

public class Parent implements Human{
	
	public Parent(){
		System.out.println("Hello from Parent class || PID: " + ManagementFactory.getRuntimeMXBean().getName().substring(0, ManagementFactory.getRuntimeMXBean().getName().indexOf('@')));
	}
	
	
	public void terminated(){
		System.out.println("Good-Bye from Parent  || PID: " + ManagementFactory.getRuntimeMXBean().getName().substring(0, ManagementFactory.getRuntimeMXBean().getName().indexOf('@')));
	}

}
