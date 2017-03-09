import java.io.*;  //Wildcard import of the java io class
public class FileArray {
/**
 * Constructor accepts a String for the filename and and integer array
 * and throws an IOException. The constructor creates a read write instance
 * of the DataOutput class, writes the numbers to the file, and then
 * closes the file
 */
	public FileArray(String filename, int[] numbers) throws IOException {
		boolean endOfFile = false;
		System.out.println("Creating the file.");
		DataOutputStream file1 = new DataOutputStream(new FileOutputStream(filename));
		System.out.println("Writing to the file.....");
		for (int i = 0; i < numbers.length; i++) {
			file1.writeInt(numbers[i]);
		}
		System.out.println("Closing the file.");
		file1.close();
	}

}
