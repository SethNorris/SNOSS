package controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import assembler.Assembler;

public class ProcessController {
	
	final String filePath = "/Users/sn255043/Documents/snossMem/";
	
	public ProcessController(){
		
	}
	
	public void executeProcess(String fileName) throws FileNotFoundException, IOException{
		Path filepath = Paths.get(filePath + fileName);
		File execFile = filepath.toFile();
		//System.out.println(execFile.getName());
		Assembler assembler = new Assembler();
		assembler.processFile(execFile);
		Path filepathfinish = Paths.get(filePath + concatFileType(fileName) + ".sno");
		
		byte[] temp = Files.readAllBytes(filepathfinish);
		System.out.println(temp.length);
		System.out.println(temp[0]);
		System.out.println(temp[1]);
		System.out.println(temp[2]);
		System.out.println(temp[3]);
		System.out.println(temp[4]);
		System.out.println(temp[5]);
		System.out.println(temp[6]);
		System.out.println(temp[7]);
		System.out.println(temp[8]);
		System.out.println(temp[9]);
		System.out.println(temp[10]);
		System.out.println(temp[11]);
	}
	
	private String concatFileType(String name){
		int length = name.length();
		return name.substring(0, length - 4);
	}
	

}
