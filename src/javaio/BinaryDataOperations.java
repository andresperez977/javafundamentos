package javaio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//

public class BinaryDataOperations {

	public static void main(String[] args) {
		writeBinaryData();
		try {
			readBinaryData();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	private static void readBinaryData() throws FileNotFoundException {
		DataInputStream is = new DataInputStream(new FileInputStream("data.bat"));
		try {

			is.readChar();
			is.readInt();
			is.readUTF();
			System.out.println(is.readUTF());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeBinaryData() {
		// TODO Auto-generated method stub
		try {
			DataOutputStream os = new DataOutputStream(new FileOutputStream("data.bat"));

			os.writeChar(34);
			os.writeInt(32);
			os.writeUTF("hello");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
