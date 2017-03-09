import java.io.*;  //Imports the java io class
/**
 * This class encrypts a file by changing the values and writing
 * it to a file
 */
public class FileEncryptionDemo {

	/**
	 * File starts here and throws an IOException
	 */
	public static void main(String[] args) throws IOException {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};  //Creates an int array
		int[] numbers2 = {0, 0, 0, 0, 0, 0, 0, 0}; //Creates a reading array
		final int INT_SIZE = 4;                    //Final integer size
		System.out.println("Opening the file.");
		/**
		 * Creates a new RandomAccessFile then uses, a for loop to write the
		 * numbers array to it, and another for loop to store the values in
		 * the numbers2 array
		 */
		RandomAccessFile file1 = new RandomAccessFile("FileEncrypt.dat", "rw");
		System.out.println("Writing data to file....");
		for (int i = 0; i < numbers.length; i++) {
			file1.writeInt(numbers[i]);
		}
		for (int i = 0; i < numbers.length; i++) {
			file1.seek(INT_SIZE * i);
			numbers2[i] = file1.readInt();
		}
		file1.close();
		/**
		 * Creates a second RandomAccessFile and writes the array to it, while
		 * encrypting the data by adding 10 to each value
		 */
		RandomAccessFile file2 = new RandomAccessFile("FileEncrypt2.dat", "rw");
		for (int i = 0; i < numbers.length; i++) {
			file2.writeInt(numbers[i] + 10);
		}
		file2.close();
		System.out.println("Done.");
		

	}

}
