package assignment2;

import java.io.*;


public class FolderInfo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		printDirectory("D:\\default softwares");

	}
	
	public static void printDirectory(String path) throws IOException {
		File folder = new File(path);
		File[] folderList = folder.listFiles();
		for(int i=0 ; i<folderList.length ; i++) {
			if(folderList[i].isFile()) {
				System.out.println("File: " + folderList[i].getName());
				System.out.println("Absolute file path: " + folderList[i].getAbsolutePath());
				System.out.println("Folder path: " + folderList[i].getParent());
			}else {
				System.out.println("Directory: " + folderList[i].getName());
				System.out.println("Path: " + folderList[i].getParent());
			}
			System.out.println();
		}
	}

}
