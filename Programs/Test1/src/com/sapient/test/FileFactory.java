package com.sapient.test;

public class FileFactory {

	public File getFileType(String FileType) {
		if (FileType == null) {
			return null;
		}
		if (FileType.equalsIgnoreCase("CSV")) {
			return new CSV();

		} else if (FileType.equalsIgnoreCase("EXCEL")) {
			return new EXCEL();

		} else if (FileType.equalsIgnoreCase("XML")) {
			return new XML();
		}
		return null;
	}
}