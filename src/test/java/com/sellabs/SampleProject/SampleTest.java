/**
 * 
 */
package com.sellabs.SampleProject;

import java.util.GregorianCalendar;

import org.testng.annotations.Test;

/**
 * @author Prosenjit
 *
 */
public class SampleTest extends GregorianCalendar {
	
	
	
	@Test
	public void name() throws Throwable {
		SampleTest st = new SampleTest();
		System.out.println("Time now: "+st.getTime());
		st.finalize();
		System.out.println(st.getTimeZone());
	}

}
