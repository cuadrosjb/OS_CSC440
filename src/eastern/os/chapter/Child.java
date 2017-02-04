package eastern.os.chapter;

import java.lang.management.ManagementFactory;
import java.util.concurrent.TimeUnit;

public class Child extends Parent implements Human{
	
	public Child(){
		super();
		System.out.println("Hello from Child class || PID: " + ManagementFactory.getRuntimeMXBean().getName().substring(0, ManagementFactory.getRuntimeMXBean().getName().indexOf('@')));
		sleep();
		terminatedC();
	}
	
	public void sleep(){
		try {
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void terminatedC(){
		System.out.println("Good-Bye from Child || PID: " + ManagementFactory.getRuntimeMXBean().getName().substring(0, ManagementFactory.getRuntimeMXBean().getName().indexOf('@')));
		terminated();
	}
}
