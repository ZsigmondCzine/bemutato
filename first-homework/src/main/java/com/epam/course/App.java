package com.epam.course;

import java.io.PrintStream;
import java.util.Iterator;

public final class  App {

	static interface IteratorFactory {
		Iterator<String> getInstance(String[] args);
	}
	private static PrintStream out = System.out;

	private static IteratorFactory factory = new IteratorFactory() {

		@Override
		public Iterator<String> getInstance(final String[] args) {
			return new StringArrayIterator(args);
		}
	};

	public static void main(final String[] args) {

		if(args == null) {
			return;
		}

		if(args.length < 1) {
			out.println("Hello World!");
		} else {
			Iterator<String> iterator = factory.getInstance(args);
			while(iterator.hasNext()) {
				out.println(iterator.next());
			}
		}
	}

	static void setIteratorFactory(final IteratorFactory factory) {
		App.factory = factory;
	}

	static void setOut(final PrintStream stream) {
		App.out = stream;
	}
}
