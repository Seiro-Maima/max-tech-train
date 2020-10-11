package ui;

import java.io.*;
import java.nio.file.*;

public class FileProcessingApp {

	public static void main(String[] args) throws IOException {

		System.out.println("Processing Files...");
		
		// create a 'temp' directory on the hard-drive
		String dirString = "c:/temp";
		Path dirPath = Paths.get(dirString);
		if(Files.notExists(dirPath)) {
			Files.createDirectories(dirPath);
			System.out.println("Directory created: " + dirPath.getFileName());
		}

		// create sub directories on the hard-drive
		String subDirString = "c:/temp/sub1/sub2";
		Path subDirPath = Paths.get(subDirString);
		if(Files.notExists(subDirPath)) {
			Files.createDirectories(subDirPath);
			System.out.println("Directory created: " + subDirPath.getFileName());
		}
		
		// create a file
		String fileString = "products.txt";
		Path filePath = Paths.get(dirString, fileString);
		if(Files.notExists(filePath)){
			Files.createFile(filePath);
		}
		
		// display file info
		System.out.println("File Name: " + filePath.getFileName());
		System.out.println("Absolute Path: " + filePath.toAbsolutePath());
		System.out.println("Is Writable?: " + Files.isWritable(filePath));

		// display files in a directory
		if(Files.exists(dirPath) && Files.isDirectory(dirPath)) {
			System.out.println("Directory: " + dirPath.toAbsolutePath());
			System.out.println("Files: " );
			DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
			for(Path p: dirStream) {
				if(Files.isRegularFile(p)) {
					System.out.println("     " + p.getFileName());
				}
//				else if(Files.isDirectory(dirPath)) {
//					System.out.println(");
//				}
			}
		}
		
		// write data to a file
		// relative path - will create file inside our project folder
		Path productsPath = Paths.get("products.txt");
		File productsFile = productsPath.toFile();
		
		PrintWriter out = new PrintWriter(
					      new BufferedWriter(
					      new FileWriter(productsFile)));
		// write data to the stream
		out.println("java\tMurach's Java Programming\t57.50");
		// close stream
		out.close();
		
		// read data from a file
		BufferedReader in = new BufferedReader(
				            new FileReader(productsFile));
		String line = in.readLine();
		System.out.println("Line read from file: " + line);
		in.close();
		
		System.out.println("Bye");
		
	}

}
