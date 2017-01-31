package controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import assembler.Assembler;

public class Shell {
	ProcessController pc;
	final String filePath = "/Users/sn255043/Documents/snossMem/";
	
	public Shell(){
		pc = new ProcessController();
	}
	
	public void start() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split;
		String input;
		
		while((input = br.readLine()) != null){
			split = input.split(" ");
			switch(split[0]){
			case "ls":
				File folder = new File(filePath);
				File[] files = folder.listFiles();
				for(File f : files){
					System.out.println(f.getName());
				}
				break;
			case "ps":
				for(String processName : pc.getProcessID().keySet()){
					System.out.println(processName);
				}
				break;
			case "exec":
				pc.executeProcess(split[1], false);
				break;
			case "exec_i":
				pc.executeProcess(split[1], true);
				break;
			case "kill":
				System.out.println(split[1]);
				break;
			case "exit":
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			
		}
	}

}
