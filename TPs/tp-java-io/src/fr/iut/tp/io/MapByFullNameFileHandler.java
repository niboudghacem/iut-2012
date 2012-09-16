package fr.iut.tp.io;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MapByFullNameFileHandler implements FileHandler {

	private HashMap<String, List<File>> mapListFile;

	@Override
	public void handleFile(File f) {
		List<File> ls = mapListFile.get(f.getName());
		if (ls == null) {
			ls = new ArrayList<File>();
			mapListFile.put(f.getName(), ls);
		}
		ls.add(f);
	}

	public void showDoubleFileInList() {
		Iterator<List<File>> it = mapListFile.values().iterator();
		while (it.hasNext()) {
			List<File> listFile = it.next();
			if (listFile.size() > 1)
				System.out.println(listFile);
		}
	}

	public MapByFullNameFileHandler() {
		mapListFile = new HashMap<String, List<File>>();
	}

	public HashMap<String, List<File>> getMapListFile() {
		return mapListFile;
	}

	public void setMapListFile(HashMap<String, List<File>> mapListFile) {
		this.mapListFile = mapListFile;
	}

}
