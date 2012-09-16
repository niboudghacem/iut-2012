package fr.iut.tp.io;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MapBySHA1FileHandler implements FileHandler {

	private HashMap<String, List<File>> mapListSHA1File;

	@Override
	public void handleFile(File f) {
		List<File> ls = mapListSHA1File.get(Sha1File.getShaOneFile(f));
		if (ls == null) {
			ls = new ArrayList<File>();
			mapListSHA1File.put(Sha1File.getShaOneFile(f), ls);
		}
		ls.add(f);
	}

	public void showDoubleFileInList() {
		Iterator<List<File>> it = mapListSHA1File.values().iterator();
		while (it.hasNext()) {
			List<File> listFile = it.next();
			if (listFile.size() > 1)
				System.out.println(listFile);
		}
	}

	public MapBySHA1FileHandler() {
		mapListSHA1File = new HashMap<String, List<File>>();
	}

	public HashMap<String, List<File>> getMapListSHA1File() {
		return mapListSHA1File;
	}

	public void setMapListSHA1File(HashMap<String, List<File>> mapListSHA1File) {
		this.mapListSHA1File = mapListSHA1File;
	}

}
