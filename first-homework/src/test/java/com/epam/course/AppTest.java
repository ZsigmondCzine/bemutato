package com.epam.course;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.io.PrintStream;
import java.util.Iterator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	public void testAppSimpleCase() {

		// DO NOT MODIFY THIS TEST

		PrintStream mock = mock(PrintStream.class);
		App.setOut(mock);
		
		App.main(new String[] {});

		verify(mock).println("Hello World!");
		
		verifyNoMoreInteractions(mock);
	}

	public void testAppWithNullArgument() {

		// DO NOT MODIFY THIS TEST

		PrintStream mock = mock(PrintStream.class);
		App.setOut(mock);

		App.main(null);

		verify(mock, never()).println(anyString());
	}
	
	public void testApp() {
		
		// DO NOT MODIFY THIS TEST
		
		@SuppressWarnings("unchecked")
		final Iterator<String> iterMock = (Iterator<String>) mock(Iterator.class);
		
		when(iterMock.hasNext()).thenReturn(true, true, true, true, true, false);
		when(iterMock.next()).thenReturn("Hello", "EPAM", "Course", "2013", "!");
				
		App.setIteratorFactory(new App.IteratorFactory() {
			
			public Iterator<String> getInstance(String[] args) {
				return iterMock;
			}
		});
		
		PrintStream mock = mock(PrintStream.class);
		App.setOut(mock);
		
		App.main(new String[]{"Hello", "EPAM", "Course", "2013", "!"});
		
		verify(mock).println("Hello");
		verify(mock).println("EPAM");
		verify(mock).println("Course");
		verify(mock).println("2013");
		verify(mock).println("!");
		verifyNoMoreInteractions(mock);
	}
}
