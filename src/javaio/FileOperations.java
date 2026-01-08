package javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
	public static void main(String[] args) {
		File file = new File("/logs/user.log");
		File directory = new File("/andres/logs/");
		System.out.println("working directory:" + System.getProperty("user.dir"));

		createPath(directory);

		createFile(file);

		createAbsolutePath();

		writeFile();

		readFile();
		bufferedWriter();
		BufferedReader();
		
		// create directory using absolute path
		File absoluteDir = new File(System.getProperty("user.dir") + "/logs/user.log");
		absoluteDir.mkdirs();
	}

	private static void bufferedWriter() {
		// TODO Auto-generated method stub
		try {
			BufferedWriter writer= 
					new BufferedWriter(new FileWriter("contacts.txt"));
			writer.write("punteria" + ";" + "puntero@g");
			writer.newLine();
			writer.write("puntero" + ";" + "puntero@g");
			writer.newLine();
			writer.write("putero" + ";" + "puntero@g");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void BufferedReader() {
		// TODO Auto-generated method stub
		try {
			System.out.println();
			System.out.println("buffered reader");
			//wrap an instance of @link{FileReader} in a instance of @link{BufferedReader}
			//so we can manipulate the data in another way in our case
			//reading the data line by line
			BufferedReader br =
					new BufferedReader(new FileReader("contacts.txt"));
			//read a line from the file
			System.out.println(br.readLine());
			String data;
			do {
				//define what we want to do 
				//read a line 
				 data=br.readLine();
				 System.out.println(data);
			} while (data !=null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void readFile() {
		// TODO Auto-generated method stub
		try {
			FileReader reader = new FileReader("log.txt");
			reader.read();
			System.out.println((char) reader.read());
			System.out.println((char) reader.read());
			System.out.println((char) reader.read());
			System.out.println((char) reader.read());
			System.out.println((char) reader.read());
			// Check the condition first before executing the while body
			int c ;
			System.out.println((char)-1 == -1);
			while ((c = reader.read()) != -1) {
				System.out.println((char) c);

			}
			
			reader.close();
			reader = new FileReader("log.txt");
			System.out.println("the second");
			c=reader.read();
			while (c!=-1) {//check if we have reached the end of the file
				//havent reached the end
				System.out.println((char)c);
				c=reader.read();
				
			}
			reader.close();
			reader = new FileReader("log.txt");
			System.out.println("the third reading");
			// Execute the commands inside the "do" body first,
			// then check the condition,if it is true ,repeat
			// the execution
			c=0;
			System.out.println("the value of c is " + c);
			do {
				c=reader.read();
				System.out.println((char) c);
			} while (c!=-1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void writeFile() {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("log.txt");
			writer.write("Black holes");
			writer.write("Pablo");
			writer.write("t");

			// Close the writer and refresh the data to the file
			writer.close();
			// writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void createAbsolutePath() {
		// TODO Auto-generated method stub
		File absoluteDir = new File(System.getProperty("user.dir") + "/logs/user.log");
		absoluteDir.mkdirs();
	}

	private static void createPath(File file) {
		// TODO Auto-generated method stub
		System.out.println(file.isAbsolute());
		System.out.println(file.getPath());
		// create directories specific by the "file" object
		file.getParentFile().mkdirs();
		System.out.println(file.getAbsolutePath());
	}

	private static void createFile(File file) {
		// TODO Auto-generated method stub

		if (file.exists()) {
			System.out.println("the log file exists");
		} else {
			System.out.println("the log file does not exist");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// With try catch, we can continue executing the program without interruption
			System.out.println("finished");
		}
	}
}
