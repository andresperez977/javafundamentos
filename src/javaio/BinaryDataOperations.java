package javaio;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
//

public class BinaryDataOperations {

	public static void main(String[] args) {
		
		try {
			
			DataOutputStream os = 
					new DataOutputStream(new FileOutputStream(""));
			os.writeChar(34);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
