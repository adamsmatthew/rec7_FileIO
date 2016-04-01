package hello;

import java.io.*;

public class Hello {
	
	// We throw an IOException so the program will crash if there is an output error.
	// A more complete program would catch the exception and handle it gracefully.
	public static void main(String[] args) throws IOException {
		
		// Usually you'll use something higher-level than a stream.
		// This example is just to illustrate how files are fundamentally
		// just a bunch of bits.
		FileOutputStream out = null;
		
		try {
			// Switch out <username> for your username...
			// String path = "c:\Users\<username>\Desktop\hi.txt"; // Windows
			String path = "/Users/<username>/Desktop/hi.txt"; // Mac			
			out = new FileOutputStream(path);
		
			// Writing binary data. 
			// Usually you won't use byte streams directly, since it's easier to
			// work with the actual data you're writing. However, it's good to
			// remember that something like this is happening under the hood.
			out.write(0b01101000);
			out.write(0b01101001);
			
		} finally {
			// Use try...finally blocks with I/O operations to make sure that resources
			// (files, connections to the internet, etc.) are closed properly even
			// if there's an error.

			if (out != null) {
				out.close();
			}
		}
	}
}
