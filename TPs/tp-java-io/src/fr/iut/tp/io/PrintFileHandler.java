package fr.iut.tp.io;

import java.io.File;

public class PrintFileHandler implements FileHandler {

	@Override
	public void handleFile(File f) {
		System.out.println(f.getName());
	}
	
}
