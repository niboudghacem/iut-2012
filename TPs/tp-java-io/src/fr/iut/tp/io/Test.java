package fr.iut.tp.io;

import java.io.File;

public class Test {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {

		File f = new File("/Users/Nora/Desktop/2012");
		FileScanner fs = new FileScanner();

		// Test PrintFileHandler
		PrintFileHandler pfh = new PrintFileHandler();
		fs.handleRecursively(f, pfh);

		// Test ListFileHandler
		ListFileHandler lfh = new ListFileHandler();
		fs.handleRecursively(f, lfh);
		System.out.println(lfh.getResultList());

		// Test MapByFullNameFileHandler
		MapByFullNameFileHandler mfnfh = new MapByFullNameFileHandler();
		fs.handleRecursively(f, mfnfh);
		mfnfh.showDoubleFileInList();

		// Test TreeBySizeHandler
		TreeBySizeHandler tbsh = new TreeBySizeHandler();
		fs.handleRecursively(f, tbsh);
		tbsh.showLargerFiles();

		// Test MapBySHA1FileHandler
		MapBySHA1FileHandler msfh = new MapBySHA1FileHandler();
		fs.handleRecursively(f, msfh);
		msfh.showDoubleFileInList();
	}
}
