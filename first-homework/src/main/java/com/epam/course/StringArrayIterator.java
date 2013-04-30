package com.epam.course;

import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class StringArrayIterator implements Iterator<String> {

	private List<String> arguments;
	private int currentIndex;

	public StringArrayIterator(final String[] args) {
		// TODO Auto-generated constructor stub
		super();
		if(args != null){
			arguments = Arrays.asList(args);
		}
		currentIndex = 0;
	}

	@Override
	public boolean hasNext() {
		if((arguments == null) || (arguments.size() == 0) || (arguments.size() == currentIndex)){
			return false;
		}
		return true;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		return arguments.get(currentIndex++);
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
}
