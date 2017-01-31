package controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import assembler.Assembler;
import cpu.Cpu;
import cpu.RAM;

public class ProcessController {
	
	private final String filePath = "/Users/sn255043/Documents/snossMem/";
	
	static int id = 0;
	private Map<String, Integer> pcbLocations = new HashMap<String,Integer>();
	private Map<String, Integer> processID = new HashMap<String,Integer>();
	private RAM ram;
	private Cpu cpu;
	
	public ProcessController(){
		ram = new RAM();
		cpu = new Cpu();
	}
	
	public void executeProcess(String fileName, boolean i) throws FileNotFoundException, IOException{
		Path filepath = Paths.get(filePath + fileName);
		File execFile = filepath.toFile();
		Assembler assembler = new Assembler();
		assembler.processFile(execFile);
		Path filepathfinish = Paths.get(filePath + concatFileType(fileName) + ".sno");
		byte[] temp = Files.readAllBytes(filepathfinish);
		String processKey = concatFileType(fileName);
		storeProcessInRam(temp, processKey);
		processID.put(processKey, id);
		id++;
		cpu.putRam(ram);
		cpu.doProgram(pcbLocations.get(processKey), i);
	}
	
	private String concatFileType(String name){
		int length = name.length();
		return name.substring(0, length - 4);
	}

	public Map<String, Integer> getProcessID() {
		return processID;
	}

	private void storeProcessInRam(byte[] process,String processKey){
		int start = ram.getFirstOpenSpot();
		ram.loadProcess(process);
		pcbLocations.put(processKey, ram.getFirstOpenSpot());
		ram.storePCBAndStack(id, start, start + process.length -1);
	}
	
	
}
