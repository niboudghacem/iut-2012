package fr.iut.tp.io;

import java.io.File;

public class FileScanner {

	public void handleRecursively(File f, FileHandler handler) {
		for (File dir : f.listFiles()) {
			if (dir.isDirectory())
				this.handleRecursively(dir, handler);
			else
				handler.handleFile(dir);
		}
	}

}
