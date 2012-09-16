package fr.iut.tp.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class TreeBySizeHandler implements FileHandler {

	private TreeMap<Long, List<File>> treeListFile;

	@Override
	public void handleFile(File f) {
		List<File> ls = treeListFile.get(f.length());
		if (ls == null) {
			ls = new ArrayList<File>();
			treeListFile.put(f.length(), ls);
		}
		ls.add(f);
	}

	public TreeBySizeHandler() {
		treeListFile = new TreeMap<Long, List<File>>();
	}

	public void showLargerFiles() {
		Iterator<?> it = treeListFile.descendingMap().entrySet().iterator();
		int i = 0;
		while (it.hasNext() && i < 10) {
			System.out.println(it.next());
			i++;
		}
	}

	public TreeMap<Long, List<File>> getTreeListFile() {
		return treeListFile;
	}

	public void setTreeListFile(TreeMap<Long, List<File>> treeListFile) {
		this.treeListFile = treeListFile;
	}

}
