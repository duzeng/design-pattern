package hk.vzero.Bridge;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplayImpl extends DisplayImpl {

	private String filename;
	private BufferedReader reader;
	private final int MAX_READAHEAD_LIMIT = 4096;
	
	public FileDisplayImpl(String fileName) {
		this.filename = fileName;
	}

	@Override
	public void rawOpen() {
		try {
			reader=new BufferedReader(new FileReader(filename));
			reader.mark(MAX_READAHEAD_LIMIT);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("=-=-=-=-=-=-=-= "+filename+ " =-=-=-=-=-=-=-=-=");
		
	}

	@Override
	public void rawPrint() {
		String line;
		try {
			reader.reset();
			while ((line=reader.readLine())!=null) {
				System.out.println("> "+ line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void rawClose() {
		System.out.println("=-=-=-=-=-=-=-= "+filename+ " =-=-=-=-=-=-=-=-=");
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
