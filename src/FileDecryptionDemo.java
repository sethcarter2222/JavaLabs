import java.io.RandomAccessFile;
import java.io.*;
public class FileDecryptionDemo {

	public static void main(String[] args) throws IOException {
		int[] numbers = {24, 16, 32, 31, 43, 40, 32, 40, 95};
		int[] numbers2 = {0, 0, 0, 0, 0, 0 , 0, 0, 0};
		final int INT_SIZE = 4;
		System.out.println("Opening the file.");
		RandomAccessFile file1 = new RandomAccessFile("FileEncrypt.dat", "r");
		System.out.println("Reading data from file....");
		for (int i = 0; i < numbers.length; i++) {
			file1.seek(INT_SIZE * i);
			numbers2[i] = (file1.readInt());
			System.out.println("Number " + i + " written.");
		}
		file1.close();
		System.out.println("Opening second file.");
		RandomAccessFile file2 = new RandomAccessFile("FileDycrypt.dat", "rw");
		System.out.println("Writing data file....");
		for (int i = 0; i < numbers2.length; i++) {
			file2.writeInt(numbers2[i] - 4);
		}
		file2.close();
		System.out.println("Done.");

	}

}
