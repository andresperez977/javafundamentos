package javaio;

import java.io.File;
import java.io.IOException;

public class FileOperations {
public static void main(String[] args) {
	File file = new File("/logs/user.log");
	File directory= new File("/andres/logs/");
	System.out.println("working directory:" + System.getProperty("user.dir"));
	
	createPath(directory);
	
	createFile(file);
	
	createAbsolutePath();
	//create directory using absolute path
	File absoluteDir = new File(System.getProperty("user.dir") + "/logs/user.log");
	absoluteDir.mkdirs();
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
	//create directories specific by the "file" object
	file.getParentFile().mkdirs();
	System.out.println(file.getAbsolutePath());
}

private static void createFile(File file) {
	// TODO Auto-generated method stub
	
	if (file.exists()) {
		System.out.println("the log file exists");
	}
	else {
		System.out.println("the log file does not exist");
		try {
			file.createNewFile();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//With try catch, we can continue executing the program without interruption 
		System.out.println("finished");
	}
}
}
