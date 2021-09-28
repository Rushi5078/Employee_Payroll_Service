package com.employeepayrolldata;

import java.io.File;
//
public class FileUtil{ 
//{
//	public static boolean deleteFiles(File contentsToDelete)
//	{
//		File[] allContents = contentsToDelete.listFiles();
//		if (allContents != null)
//		{
//			for (File file : allContents)
//			{
//				deleteFiles(file); // delete temp1, temp2, temp 3...temp9
//			}
//		}
//		return contentsToDelete.delete();
//
//	}
//}
//public class FileUtils {
	public static boolean deleteFolder(File file) {
		for (File subFile : file.listFiles()) {
			if (subFile.isDirectory()) {
				deleteFolder(subFile);
			} 
			else {
				subFile.delete();
			}
		}
		return file.delete();
	}
	
}