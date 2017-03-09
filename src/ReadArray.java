import java.io.*;  //Wildcard import of the java io class
/**
 * This program accesses a file and reads the values and displays
 * them to the user
 */
public class ReadArray {
/**
 * Constructor accepts the file name and an int, and throws an IOException.
 * It checks to see if there is another integer in the file, and if there
 * is, it displays it to the console, then closes the file
 */
	public ReadArray(String filename, int numbers) throws IOException {
		DataInputStream file1 = new DataInputStream(new FileInputStream(filename));
		boolean endOfFile = false;
		while (!endOfFile) {
			try {
				numbers = file1.readInt();
				System.out.println(numbers);
			} catch (EOFException e) {
				endOfFile = true;
			}
		}
		file1.close();
	}

}
