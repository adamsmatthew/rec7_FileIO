package readFile;

import java.io.*;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		
		try {
			// Using a BufferedReader basically means that we ask for 
			// a bunch of data at once, instead of looking things up
			// character by character. This makes it significantly faster.
			in = new BufferedReader(new FileReader("/Users/matthew/Desktop/hi.txt"));
			
			// Loop to grab each character from the buffer and send them to
			// the System.out output stream to display the file.
			int ch = in.read();
			while (ch != -1) {
				// Note that read() is giving ints instead of chars. This makes 
				// it easy to use -1 to signal the end of the file, but means
				// that we need to cast to char to display the characters.
				System.out.print((char) ch); // <-- System.out is just a stream too!
				ch = in.read();
			}
			
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}
}
