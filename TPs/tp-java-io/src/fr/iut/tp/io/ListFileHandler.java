package fr.iut.tp.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListFileHandler implements FileHandler {

	private List<File> resultList;

	@Override
	public void handleFile(File f) {
		if (f.isFile())
			resultList.add(f);
	}

	public List<File> getResultList() {
		return resultList;
	}

	public void setResultList(List<File> resultList) {
		this.resultList = resultList;
	}

	public ListFileHandler() {
		resultList = new ArrayList<File>();
	}

}
