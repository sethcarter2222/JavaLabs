import java.io.IOException; // Imports the java io IOException class
/**
 * This program creates a FileArray instance that creates a file
 * that holds an array and an instance of ReadArray that gets the
 * integers in the file and prints them out
 */
public class FileArrayDemo {
/**
 * Program starts here, main method throws an IOException
 */
	public static void main(String[] args) throws IOException {
		
		String filename = "FileArray.dat";
		int[] numbers = {1, 2, 3, 4, 5, 6, 7};
		int number = 0;
		/**
		 * Creates a new instance of the FileArray and ReadArray class
		 * and passes through the filename String and the numbers array
		 */
		FileArray newFile = new FileArray(filename, numbers);
		ReadArray newFile2 = new ReadArray(filename, number);
	}

}
