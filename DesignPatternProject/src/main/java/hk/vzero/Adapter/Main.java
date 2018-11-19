package hk.vzero.Adapter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {

	public static void main(String[] args) throws IOException {

//		try (Writer writer = new FileWriter("src/main/resources/readme.txt")) {
//			writer.write("hello world");
//		}

		FileIO f = new FileProperties();
		try {
			f.readFromFile("src/main/resources/file.txt");
			f.setValue("year", "2004");
			f.setValue("month", "4");
			f.setValue("day", "21");
			f.writeToFile("src/main/resources/newfile.txt");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
