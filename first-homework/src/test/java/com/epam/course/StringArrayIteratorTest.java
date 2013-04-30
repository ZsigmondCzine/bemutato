package com.epam.course;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class StringArrayIteratorTest extends TestCase {

	public void testArgumentNull() {
		
		// DO NOT MODIFY THIS TEST
		
		StringArrayIterator iterator = new StringArrayIterator(null);
		assertFalse(iterator.hasNext());
	}

	public void testIteratorWithEmptyArray() {
		
		// DO NOT MODIFY THIS TEST
		
		StringArrayIterator iterator = new StringArrayIterator(new String[] {});
		assertFalse(iterator.hasNext());
	}

	public void testIteratorWithFilledArray() {

		// DO NOT MODIFY THIS TEST
		
		int size = (int) (Math.random() * 50.0);

		List<String> strs = new ArrayList<String>(size);
		SecureRandom random = new SecureRandom();

		for (int i = 0; i < size; ++i) {
			strs.add(i, new BigInteger(130, random).toString(32));
		}

		StringArrayIterator iterator = new StringArrayIterator(strs.toArray(new String[strs.size()]));

		for (String item : strs) {
			assertTrue(iterator.hasNext());
			assertEquals(item, iterator.next());
		}
		assertFalse(iterator.hasNext());
	}
	
	public void testRemoveMethod() {
		
		// DO NOT MODIFY THIS TEST
		
		try{
			new StringArrayIterator(new String[]{"first"}).remove();
			fail();
		}catch(UnsupportedOperationException uoe) {
			//ignore
		}
	}
}
