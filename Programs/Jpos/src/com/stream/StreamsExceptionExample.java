package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExceptionExample {

	public static void main(String[] args) {

		// Stream<Integer> stream = Stream.of(1,2,3,4);

		List<String> StringList = new ArrayList<>();
		StringList.add("ank");

		// Convert list (ArrayList) to stream
		Stream<String> stream = StringList.stream();

		// Now, use stream
		stream.forEach(System.out::println); // Displays - ank, az, ad

		/**
		 * UNCOMMENT this line to avoid - java.lang.IllegalStateException:
		 * stream has already been operated upon or closed
		 */
		// stream = StringList.stream(); // Convert list (ArrayList) to stream

		// Below will throw - Exception in thread "main"
		// java.lang.IllegalStateException: stream has already been operated
		// upon or closed
		// Exception could be avoided if above line is uncommented
		//stream.forEach(System.out::println);

		/**
		 * Why it throws - Exception in thread "main"
		 * java.lang.IllegalStateException: stream has already been operated
		 * upon or closed? Because streams can't be used again
		 *
		 * Message itself is self-explanatory - stream has already been operated
		 * upon or closed - in our case - stream has already been operated upon
		 *
		 * Solution - Create new stream every time for some new operation.
		 */

	}

}
